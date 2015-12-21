package com.wang.controller;

import com.alibaba.fastjson.JSONObject;
import com.wang.domain.User;
import com.wang.model.Mail;
import com.wang.serivce.UserService;
import com.wang.util.AjaxReturn;
import com.wang.util.MD5Util;
import com.wang.util.MailSender;
import com.wang.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.MessagingException;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by wangwenxiang on 15-12-7.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登陆页面跳转
     */
    @RequestMapping("loginPage")
    public String userLoginPage(){
        return "login";
    }

    /**
     * 用户注册页面跳转
     */
    @RequestMapping("registerPage")
    public String userRegisterPage(){
        return "register";
    }

    /**
     * 用户登陆
     * 验证用户是否存在
     * 验证用户是否正常
     * 验证用户密码
     * @param user_id 用户账号
     * @param user_password 用户密码
     * @return
     */
    @RequestMapping("userLogin")
    @ResponseBody
    public JSONObject userLogin(int user_id, String user_password, HttpSession session){
        User user = userService.getUserById(user_id);
        if (user == null){
            return AjaxReturn.Data2Ajax(0,"该账号没有注册",null);
        }
        if (user.getUser_state() == 0){
            return AjaxReturn.Data2Ajax(0,"该账号已经冻结",null);
        }
        try{
            if (MD5Util.validPassword(user_password,user.getUser_password())){
                user.setUser_password(null);
                session.setAttribute("user",user);
                return AjaxReturn.Data2Ajax(1,null,null);
            }else{
                return AjaxReturn.Data2Ajax(0,"密码错误",null);
            }
        }catch (NoSuchAlgorithmException ne){
            return AjaxReturn.Data2Ajax(0,"服务器异常",null);
        }catch (UnsupportedEncodingException ue){
            return AjaxReturn.Data2Ajax(0,"服务器异常",null);
        }
    }

    /**
     * 用户注册第一步，获取用户邮箱
     * 验证用户邮箱格式
     * 验证数据库是否已经注册
     * 产生数字验证码，存入session和application
     * @param request 通过request获取全局变量application和session
     * @param user_mail 获取用户邮箱
     * @return 返回结果
     */
    @RequestMapping("register1")
    @ResponseBody
    public JSONObject register1(HttpServletRequest request, String user_mail){
        if(!StringUtil.checkEmail(user_mail)){
            return AjaxReturn.Data2Ajax(0,"邮箱格式错误",null);
        }
        if(userService.checkMail(user_mail)>0){
            return AjaxReturn.Data2Ajax(0,"该邮箱已经被注册",null);
        }
        String code = StringUtil.getRandomCode(4);
        String content = "你好，验证码为："+code;
        Mail mail = new Mail(user_mail,content);
        HttpSession session = request.getSession();
        ServletContext application = request.getServletContext();
        session.setAttribute("mail",user_mail);
        session.setAttribute("registerCode",code);
        application.setAttribute("register:"+user_mail,code);
        try {
            MailSender.send(mail);
        }catch (MessagingException me){
            return AjaxReturn.Data2Ajax(0,"服务器异常",null);
        }
        return AjaxReturn.Data2Ajax(1,null,null);
    }

    /**
     * 用户注册第二步，验证邮箱验证码
     * 从session中获取第一步中的邮箱
     * 通过邮箱获取application中的code并验证
     * @param request
     * @param code
     * @return
     */
    @RequestMapping("register2")
    @ResponseBody
    public JSONObject register2(HttpServletRequest request, String code){
        if (code == null || "".equals(code)){
            return AjaxReturn.Data2Ajax(0,"验证码未知错误",null);
        }
        String user_mail = request.getSession().getAttribute("mail").toString();
        if (user_mail == null || "".equals(user_mail)){
            return AjaxReturn.Data2Ajax(0,"请按步骤进行",null);
        }
        String app_code = request.getServletContext().getAttribute("register:"+user_mail).toString();
        if(app_code == null || "".equals(app_code)){
            return AjaxReturn.Data2Ajax(0,"请按步骤进行",null);
        }
        if (code.equals(app_code)){
            return AjaxReturn.Data2Ajax(1,null,null);
        }
        return AjaxReturn.Data2Ajax(0,"验证码错误",null);
    }

    /**
     *
     * @param request
     * @param user_name
     * @param user_password
     * @return
     */
    @RequestMapping("register3")
    @ResponseBody
    public JSONObject register3(HttpServletRequest request,String user_name,String user_password){
        if(user_name == null || "".equals(user_name) || user_password == null || "".equals(user_password)){
            return AjaxReturn.Data2Ajax(0,"用户信息错误",null);
        }
        HttpSession session = request.getSession();
        String user_mail = session.getAttribute("mail").toString();
        if(user_mail == null || "".equals(user_mail)){
            return AjaxReturn.Data2Ajax(0,"非法用户",null);
        }
        String sessionCode = session.getAttribute("registerCode").toString();
        String applicaCode = request.getServletContext().getAttribute("register:"+user_mail).toString();
        if(sessionCode == null || "".equals(sessionCode) || !sessionCode.equals(applicaCode)){
            return AjaxReturn.Data2Ajax(0,"用户验证失败",null);
        }
        User user = new User();
        user.setUser_mail(user_mail);
        user.setUser_name(user_name);
        try {
            user.setUser_password(MD5Util.getEncryptedPwd(user_password));
        }catch (Exception e){
            return AjaxReturn.Data2Ajax(0,"系统错误",null);
        }
        if(userService.addUser(user) == 1){
            JSONObject jb = new JSONObject();
            jb.put("user_mail",user_mail);
            return AjaxReturn.Data2Ajax(1,"success",jb);
        }else{
            return AjaxReturn.Data2Ajax(0,"系统错误",null);
        }
    }

}

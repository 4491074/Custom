package com.wang.serivce;

import com.wang.dao.UserDao;
import com.wang.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangwenxiang on 15-12-7.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserById(int user_id){
        return userDao.getUserById(user_id);
    }

    public int checkMailorPhone(int registerType,String account){
        if(registerType == 0){
            return userDao.checkMail(account);
        }else if (registerType == 1){
            return userDao.checkPhone(account);
        }
        return -1;
    }

    public int addUser(User user){
        return userDao.addUser(user);
    }

}

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

    public int checkMail(String user_mail){
        return userDao.checkMail(user_mail);
    }

    public int addUser(User user){
        return userDao.addUser(user);
    }

}

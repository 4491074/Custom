package com.wang.dao;

import com.wang.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * Created by wangwenxiang on 15-12-7.
 */
@Component
public interface UserDao {

    @Select("select * from t_user where user_id=#{0}")
    User getUserById(int user_id);

    @Select("select count(*) from t_user where user_mail=#{0}")
    int checkMail(String user_mail);

    @Select("select count(*) from t_user where user_phone=#{0}")
    int checkPhone(String user_phone);

    @Insert("insert into t_user values (null,#{user_mail},#{user_name},#{user_password},null,10)")
    int addUser(User user);
}

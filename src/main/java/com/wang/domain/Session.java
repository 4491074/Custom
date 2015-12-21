package com.wang.domain;

import java.util.Date;

/**
 * Created by wangwenxiang on 15-12-9.
 */
public class Session {
    private int session_id;
    private String session_name;
    private Date session_time;
    private int session_grade;
    private int session_user;
    private int session_custom;
    private int session_result;
    private int session_state;

    public int getSession_id() {
        return session_id;
    }

    public void setSession_id(int session_id) {
        this.session_id = session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public Date getSession_time() {
        return session_time;
    }

    public void setSession_time(Date session_time) {
        this.session_time = session_time;
    }

    public int getSession_grade() {
        return session_grade;
    }

    public void setSession_grade(int session_grade) {
        this.session_grade = session_grade;
    }

    public int getSession_user() {
        return session_user;
    }

    public void setSession_user(int session_user) {
        this.session_user = session_user;
    }

    public int getSession_custom() {
        return session_custom;
    }

    public void setSession_custom(int session_custom) {
        this.session_custom = session_custom;
    }

    public int getSession_result() {
        return session_result;
    }

    public void setSession_result(int session_result) {
        this.session_result = session_result;
    }

    public int getSession_state() {
        return session_state;
    }

    public void setSession_state(int session_state) {
        this.session_state = session_state;
    }
}

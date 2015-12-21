package com.wang.domain;

/**
 * Created by wangwenxiang on 15-12-9.
 */
public class Role {
    private int role_id;
    private String role_name;
    private int role_user_manage;
    private int role_custom_manage;
    private int role_session_manage;
    private int role_question_manage;
    private int role_state;

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public int getRole_user_manage() {
        return role_user_manage;
    }

    public void setRole_user_manage(int role_user_manage) {
        this.role_user_manage = role_user_manage;
    }

    public int getRole_custom_manage() {
        return role_custom_manage;
    }

    public void setRole_custom_manage(int role_custom_manage) {
        this.role_custom_manage = role_custom_manage;
    }

    public int getRole_session_manage() {
        return role_session_manage;
    }

    public void setRole_session_manage(int role_session_manage) {
        this.role_session_manage = role_session_manage;
    }

    public int getRole_question_manage() {
        return role_question_manage;
    }

    public void setRole_question_manage(int role_question_manage) {
        this.role_question_manage = role_question_manage;
    }

    public int getRole_state() {
        return role_state;
    }

    public void setRole_state(int role_state) {
        this.role_state = role_state;
    }
}

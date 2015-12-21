package com.wang.domain;

/**
 * Created by wangwenxiang on 15-12-9.
 */
public class Manager {
    private int manager_id;
    private String manager_name;
    private String manager_password;
    private int manager_role;
    private int manager_state;

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getManager_password() {
        return manager_password;
    }

    public void setManager_password(String manager_password) {
        this.manager_password = manager_password;
    }

    public int getManager_role() {
        return manager_role;
    }

    public void setManager_role(int manager_role) {
        this.manager_role = manager_role;
    }

    public int getManager_state() {
        return manager_state;
    }

    public void setManager_state(int manager_state) {
        this.manager_state = manager_state;
    }
}

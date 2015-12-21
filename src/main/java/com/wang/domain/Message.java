package com.wang.domain;

import java.util.Date;

/**
 * Created by wangwenxiang on 15-12-9.
 */
public class Message {
    private int message_id;
    private int message_session;
    private int message_object;
    private String message_content;
    private Date message_time;
    private int message_state;

    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public void setMessage_session(int message_session) {
        this.message_session = message_session;
    }

    public void setMessage_object(int message_object) {
        this.message_object = message_object;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    public void setMessage_time(Date message_time) {
        this.message_time = message_time;
    }

    public void setMessage_state(int message_state) {
        this.message_state = message_state;
    }

    public int getMessage_session() {
        return message_session;
    }

    public int getMessage_object() {
        return message_object;
    }

    public String getMessage_content() {
        return message_content;
    }

    public Date getMessage_time() {
        return message_time;
    }

    public int getMessage_state() {
        return message_state;
    }
}

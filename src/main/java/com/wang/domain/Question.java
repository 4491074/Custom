package com.wang.domain;

/**
 * Created by wangwenxiang on 15-12-9.
 */
public class Question {
    private int question_id;
    private String question_content;
    private int question_state;

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getQuestion_content() {
        return question_content;
    }

    public void setQuestion_content(String question_content) {
        this.question_content = question_content;
    }

    public int getQuestion_state() {
        return question_state;
    }

    public void setQuestion_state(int question_state) {
        this.question_state = question_state;
    }
}

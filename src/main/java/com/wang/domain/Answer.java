package com.wang.domain;

/**
 * Created by wangwenxiang on 15-12-9.
 */
public class Answer {
    private int answer_id;
    private int answer_question;
    private String answer_content;
    private int answer_state;

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    public int getAnswer_question() {
        return answer_question;
    }

    public void setAnswer_question(int answer_question) {
        this.answer_question = answer_question;
    }

    public String getAnswer_content() {
        return answer_content;
    }

    public void setAnswer_content(String answer_content) {
        this.answer_content = answer_content;
    }

    public int getAnswer_state() {
        return answer_state;
    }

    public void setAnswer_state(int answer_state) {
        this.answer_state = answer_state;
    }
}

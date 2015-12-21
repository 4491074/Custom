package com.wang.controller;

import com.wang.serivce.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wangwenxiang on 15-12-7.
 */
@Controller
@RequestMapping("question")
public class QuestionController {

    @Autowired
    private TestService testService;

}

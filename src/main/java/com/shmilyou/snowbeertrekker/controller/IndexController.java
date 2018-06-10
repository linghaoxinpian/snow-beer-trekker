package com.shmilyou.snowbeertrekker.controller;

import com.shmilyou.snowbeertrekker.service.ReviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    private static Logger logger= LoggerFactory.getLogger(IndexController.class);

    @Autowired
    ReviewService reviewService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("review")
    public String review(){
        return "review";
    }
}

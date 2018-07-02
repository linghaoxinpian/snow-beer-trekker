package com.shmilyou.snowbeertrekker.utils;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyHandlerExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handle, Exception ex) {
        System.out.println("自定义全局异常解析器");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("ex",ex);
        modelAndView.setViewName("error1");
        return modelAndView;
    }
}

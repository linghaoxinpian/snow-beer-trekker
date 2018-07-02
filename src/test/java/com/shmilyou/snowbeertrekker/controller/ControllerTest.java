package com.shmilyou.snowbeertrekker.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mvc.xml", "classpath:spring-mybatis.xml"})
public class ControllerTest {
    private Logger logger = LoggerFactory.getLogger(ControllerTest.class);
    @Autowired
    private IndexController indexController;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver(); //在test中重新配置视图解析器,xml中定义的失效了，不知为何
        resolver.setPrefix("jsp/");
        resolver.setSuffix(".jsp");
        mockMvc = MockMvcBuilders.standaloneSetup(indexController).setViewResolvers(resolver).build();
    }

    //mvcResult.getResponse().getContentAsString(),返回总为空，问题待定
    @Test
    public void nullPointTest() throws Exception {
        ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/index"));
        MvcResult mvcResult = resultActions.andReturn();
        logger.info("=========="+mvcResult.getResponse().getContentAsString()); 

    }
}

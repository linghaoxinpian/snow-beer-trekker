package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.Sales;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-mvc.xml"})
public class SalesRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(SalesRepositoryTest.class);
    @Autowired
    SalesRepository salesRepository;

    @Test
    public void insertOne_test() {
        Sales sales=new Sales("高山双人帐篷","p1.jpg",14,0);
        salesRepository.insertOne(sales);
        Assert.notNull(sales.getId());
    }
}

package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.controller.IndexController;
import com.shmilyou.snowbeertrekker.entity.Review;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-mvc.xml"})
public class ReviewRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    ReviewRepository reviewRepository;

    @Test
    public void insertOne_test() {
        Review review = new Review("111", "2222", "40.png", new Date());
        reviewRepository.insertOne(review);
        logger.info("==========获取自增主键id:" + review.getId());
        List<Review> reviews = reviewRepository.findAll();
        logger.info("==========size:" + reviews.size());
    }
}

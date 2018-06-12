package com.shmilyou.snowbeertrekker.dao;

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
    private static Logger logger = LoggerFactory.getLogger(ReviewRepositoryTest.class);
    @Autowired
    ReviewRepository reviewRepository;

    @Test
    public void insertOne_test() {
        Review review = new Review("探秘雅江峡谷", "几位选手以优秀的个人能力展现，过关斩将，终于如愿以偿进入探索队伍，并和科学家、discover摄制组及来自全国各地的雪花啤酒的拥趸、大小“背包客”一起结成“驴友”踏上神秘的雅鲁藏布大峡谷的探索征程", "year05.jpg", new Date());
        reviewRepository.insertOne(review);
        logger.info("==========获取自增主键id:" + review.getId());
        List<Review> reviews = reviewRepository.findAll();
        logger.info("==========size:" + reviews.size());
    }
}

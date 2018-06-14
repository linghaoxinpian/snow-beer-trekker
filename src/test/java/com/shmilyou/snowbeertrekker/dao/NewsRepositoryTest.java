package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.News;
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
public class NewsRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(NewsRepositoryTest.class);
    @Autowired
    NewsRepository newsRepository;

    @Test
    public void insertOne_test() {
        News news = new News("雪花啤酒勇闯天涯 冲破雪线活动全国启动 2012-07-15", "2012年7月，全国持续时间最长、规模最大的原创品牌活动“雪花勇闯天涯——冲破雪线”正式启动，并在全国火热招募 高原、雪山、荒野，携手勇闯队伍的极限任务，已成为雪花啤酒一年一度的户外饕餮盛宴。自2005年起，雪花勇闯天涯活动共计行走10余万公里... ");
        newsRepository.insertOne(news);
        Assert.notNull(news.getId());
    }
}

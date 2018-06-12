package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.Footage;
import com.shmilyou.snowbeertrekker.entity.Video;
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
public class VideoRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(VideoRepositoryTest.class);
    @Autowired
    VideoRepository videoRepository;

    @Test
    public void insertOne_test() {
        Video video=new Video("雪花勇闯天涯驾驭先锋之宜春花","vp2.gif");
        videoRepository.insertOne(video);
        Assert.notNull(video.getId());
    }
}

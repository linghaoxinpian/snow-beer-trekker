package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.Alliance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml", "classpath:spring-mvc.xml"})
public class AllianceRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(AllianceRepositoryTest.class);
    @Autowired
    AllianceRepository allianceRepository;

    @Test
    public void insertOne_test() {
        Alliance alliance = new Alliance("baidu","lp1.gif","http://www.baidu.com");
        allianceRepository.insertOne(alliance);
        Assert.notNull(alliance.getId());

        Alliance alliance1 = allianceRepository.findOne(Long.class,alliance.getId());
        Assert.notNull(alliance1);
        List<Alliance> alliances = allianceRepository.findAll();
        logger.info("==========="+alliances.get(0).getLink());
    }
}

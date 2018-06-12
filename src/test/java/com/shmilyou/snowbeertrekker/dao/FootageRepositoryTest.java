package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.Footage;
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
public class FootageRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(FootageRepositoryTest.class);
    @Autowired
    FootageRepository footageRepository;

    @Test
    public void insertOne_test() {
        Footage footage = new Footage("【导语】3公里的激流皮筏艇、8公里的越野跑、4公里的登山闯关……9月2日，雪花啤酒“勇闯天涯”2012年度“冲破雪线”勇闯队伍第二场选拔赛在池州石台县的百丈崖户外基地举行。来自安庆的39岁“萌爹”蒋迎兵以1小时48分的成绩率先完成被誉为“安徽版铁人三项”的挑战项目，成为第二位直接晋级全国勇闯天涯活动的我省勇士。", "p3.jpg");
        footageRepository.insertOne(footage);
        Assert.notNull(footage.getId());

        Footage footage1 = footageRepository.findOne(footage.getId());
        Assert.notNull(footage1);
    }
}

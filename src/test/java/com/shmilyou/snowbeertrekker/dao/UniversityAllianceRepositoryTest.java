package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.UniversityAlliance;
import com.shmilyou.snowbeertrekker.entity.User;
import com.shmilyou.snowbeertrekker.entity.enums.Job;
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
public class UniversityAllianceRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(UniversityAllianceRepositoryTest.class);
    @Autowired
    UniversityAllianceRepository aniversityAllianceRepository;

    @Test
    public void insertOne_test() {
        UniversityAlliance universityAlliance = new UniversityAlliance("xxx","ishou",100,Job.undergraduate);
        User user=new User();
        user.setId((long) 12);
        universityAlliance.setUser(user);
        aniversityAllianceRepository.insertOne(universityAlliance);
        Assert.notNull(universityAlliance.getId());

        UniversityAlliance aniversityAlliance1 = aniversityAllianceRepository.findOne(Long.class,universityAlliance.getId());
        Assert.notNull(aniversityAlliance1);
        List<UniversityAlliance> aniversityAlliances = aniversityAllianceRepository.findAll();
        logger.info("==========associationName:"+aniversityAlliances.get(0).getAssociationName());
    }

    @Test
    public void findOneTest(){
        UniversityAlliance one = aniversityAllianceRepository.findOne(Long.class,Long.valueOf(5));
        Assert.notNull(one);
        logger.info("============"+one.getUser());
    }
}

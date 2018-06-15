package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.UniversityAlliance;
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
        UniversityAlliance aniversityAlliance = new UniversityAlliance("xxx","ishou",100,Job.undergraduate);
        aniversityAllianceRepository.insertOne(aniversityAlliance);
        Assert.notNull(aniversityAlliance.getId());

        UniversityAlliance aniversityAlliance1 = aniversityAllianceRepository.findOne(Long.class,aniversityAlliance.getId());
        Assert.notNull(aniversityAlliance1);
        List<UniversityAlliance> aniversityAlliances = aniversityAllianceRepository.findAll();
        logger.info("==========associationName:"+aniversityAlliances.get(0).getAssociationName());
    }
}

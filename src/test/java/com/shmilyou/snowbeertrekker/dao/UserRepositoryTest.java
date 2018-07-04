package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.User;
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
public class UserRepositoryTest {
    private static Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);
    @Autowired
    UserRepository userRepository;

    @Test
    public void insertOne_test() {
        User user=new User("xxxxxxxx",0,"ad",0,0);
        userRepository.insertOne(user);
        Assert.notNull(user.getId());
    }

    @Test
    public void findAll_test(){
        List<User> users = userRepository.findAll();
        logger.info("================="+users.toString());
    }

    @Test
    public void findOneTest(){
        User one = userRepository.findOne(Long.class, Long.valueOf(12));
        logger.info("================="+one.toString());
    }
}

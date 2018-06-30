package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.BaseRepository;
import com.shmilyou.snowbeertrekker.dao.UserRepository;
import com.shmilyou.snowbeertrekker.entity.User;
import com.shmilyou.snowbeertrekker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    UserServiceImpl(UserRepository baseRepository) {
        super(baseRepository);
    }
}

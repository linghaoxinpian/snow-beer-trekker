package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.BaseRepository;
import com.shmilyou.snowbeertrekker.dao.FootageRepository;
import com.shmilyou.snowbeertrekker.entity.Footage;
import com.shmilyou.snowbeertrekker.service.BaseService;
import com.shmilyou.snowbeertrekker.service.FootageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootageServiceImpl extends BaseServiceImpl<Footage> implements FootageService {

    @Autowired
    FootageServiceImpl(FootageRepository footageRepository) {
        super(footageRepository);
    }
}

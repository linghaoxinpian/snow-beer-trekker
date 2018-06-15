package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.AllianceRepository;
import com.shmilyou.snowbeertrekker.dao.BaseRepository;
import com.shmilyou.snowbeertrekker.entity.Alliance;
import com.shmilyou.snowbeertrekker.service.AllianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AllianceServiceImpl extends BaseServiceImpl<Alliance> implements AllianceService {
    @Autowired
    AllianceServiceImpl(AllianceRepository baseRepository) {
        super(baseRepository);
    }
}

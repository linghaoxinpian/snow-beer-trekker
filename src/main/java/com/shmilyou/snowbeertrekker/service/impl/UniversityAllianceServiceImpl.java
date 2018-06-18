package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.UniversityAllianceRepository;
import com.shmilyou.snowbeertrekker.entity.UniversityAlliance;
import com.shmilyou.snowbeertrekker.service.BaseService;
import com.shmilyou.snowbeertrekker.service.UniversityAllianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityAllianceServiceImpl extends BaseServiceImpl<UniversityAlliance> implements UniversityAllianceService {
    @Autowired
    UniversityAllianceServiceImpl(UniversityAllianceRepository baseRepository) {
        super(baseRepository);
    }
}

package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.UniversityAllianceRepository;
import com.shmilyou.snowbeertrekker.entity.UniversityAlliance;
import com.shmilyou.snowbeertrekker.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

public class UniversitoryAllianceServiceImpl extends BaseServiceImpl<UniversityAlliance> implements BaseService<UniversityAlliance> {
    @Autowired
    UniversitoryAllianceServiceImpl(UniversityAllianceRepository baseRepository) {
        super(baseRepository);
    }
}

package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.SalesRepository;
import com.shmilyou.snowbeertrekker.entity.Sales;
import com.shmilyou.snowbeertrekker.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesServiceImpl extends BaseServiceImpl<Sales> implements SalesService {

    @Autowired
    SalesServiceImpl(SalesRepository baseRepository) {
        super(baseRepository);
    }
}

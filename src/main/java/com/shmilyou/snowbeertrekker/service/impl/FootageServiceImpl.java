package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.FootageRepository;
import com.shmilyou.snowbeertrekker.entity.Footage;
import com.shmilyou.snowbeertrekker.service.FootageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FootageServiceImpl implements FootageService {

    @Autowired
    FootageRepository footageRepository;

    @Override
    public Footage findOne(Long id) {
        return footageRepository.findOne(id);
    }

    @Override
    public void addOne(Footage footage) {
        footageRepository.insertOne(footage);
    }

    @Override
    public List<Footage> findAll() {
        return footageRepository.findAll();
    }
}

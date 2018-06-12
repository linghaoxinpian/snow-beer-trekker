package com.shmilyou.snowbeertrekker.service;

import com.shmilyou.snowbeertrekker.entity.Footage;

import java.util.List;

public interface FootageService {

    Footage findOne(Long id);

    void addOne(Footage footage);

    List<Footage> findAll();
}

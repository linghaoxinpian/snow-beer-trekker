package com.shmilyou.snowbeertrekker.service;

import com.shmilyou.snowbeertrekker.entity.BasePojo;
import com.shmilyou.snowbeertrekker.entity.Video;

import java.util.List;

public interface BaseService<T extends BasePojo> {
    List<T> findAll();

    void addOne(T pojo);
}

package com.shmilyou.snowbeertrekker.service;

import com.shmilyou.snowbeertrekker.entity.BasePojo;

import java.util.List;

public interface BaseService<T extends BasePojo> {
    List<T> findAll();

    void addOne(T pojo);

    <S> T findOne(Class<S> clazz,S id);
}

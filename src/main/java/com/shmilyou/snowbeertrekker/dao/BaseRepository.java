package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.BasePojo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseRepository<T extends BasePojo> {

    List<T> findAll();

    void insertOne(T video);

    <S> T findOne(Class<S> clazz,@Param("id") S id);
}

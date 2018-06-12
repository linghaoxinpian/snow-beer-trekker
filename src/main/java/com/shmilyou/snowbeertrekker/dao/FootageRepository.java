package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.Footage;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FootageRepository {

    Footage findOne(Long id);

    void insertOne(Footage footage);

    @Select("SELECT * FROM footage")
    List<Footage> findAll();
}

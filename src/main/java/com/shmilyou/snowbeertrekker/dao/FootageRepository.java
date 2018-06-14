package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.Footage;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FootageRepository extends BaseRepository<Footage>{

//    @Override
//    <S> Footage findOne(Class<S> clazz,@Param("id") S id);
//
//    void insertOne(Footage footage);

    @Select("SELECT * FROM footage")
    List<Footage> findAll();
}

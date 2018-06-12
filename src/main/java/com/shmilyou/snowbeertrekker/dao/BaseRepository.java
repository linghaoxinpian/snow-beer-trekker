package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.BasePojo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BaseRepository<T extends BasePojo> {

    List<T> findAll();

    void insertOne(T video);

}

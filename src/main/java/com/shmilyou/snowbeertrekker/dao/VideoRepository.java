package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.Video;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideoRepository {

    @Select("SELECT * FROM video")
    List<Video> findAll();

    @Insert("INSERT INTO video(name,src) VALUES(#{name},#{src})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void insertOne(Video video);
}

package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.Review;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReviewRepository {

    @Select("SELECT * FROM review")
    List<Review> findAll();

    Long insertOne(Review review);
}

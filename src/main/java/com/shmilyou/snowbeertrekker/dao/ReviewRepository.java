package com.shmilyou.snowbeertrekker.dao;

import com.shmilyou.snowbeertrekker.entity.Review;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ReviewRepository extends BaseRepository<Review>{

    List<Review> findAll();

    void insertOne(Review review);
}

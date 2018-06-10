package com.shmilyou.snowbeertrekker.service;

import com.shmilyou.snowbeertrekker.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> findAllReview();

    Long addOne(Review review);
}

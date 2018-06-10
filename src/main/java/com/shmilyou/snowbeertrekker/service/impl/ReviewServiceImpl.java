package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.ReviewRepository;
import com.shmilyou.snowbeertrekker.entity.Review;
import com.shmilyou.snowbeertrekker.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    public List<Review> findAllReview() {
        return reviewRepository.findAll();
    }

    public Long addOne(Review review){
        return reviewRepository.insertOne(review);
    }
}

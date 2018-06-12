package com.shmilyou.snowbeertrekker.service;

import com.shmilyou.snowbeertrekker.entity.Video;

import java.util.List;

public interface VideoService {
    List<Video> findAll();

    void addOne(Video video);
}

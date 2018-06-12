package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.VideoRepository;
import com.shmilyou.snowbeertrekker.entity.Video;
import com.shmilyou.snowbeertrekker.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    VideoRepository videoRepository;

    @Override
    public List<Video> findAll() {
        return videoRepository.findAll();
    }

    @Override
    public void addOne(Video video) {
        videoRepository.insertOne(video);
    }
}

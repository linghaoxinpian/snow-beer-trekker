package com.shmilyou.snowbeertrekker.service.impl;

import com.shmilyou.snowbeertrekker.dao.NewsRepository;
import com.shmilyou.snowbeertrekker.entity.News;
import com.shmilyou.snowbeertrekker.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl extends BaseServiceImpl<News> implements NewsService {
    @Autowired
    NewsServiceImpl(NewsRepository baseRepository) {
        super(baseRepository);
    }
}

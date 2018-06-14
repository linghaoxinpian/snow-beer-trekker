package com.shmilyou.snowbeertrekker.controller;

import com.shmilyou.snowbeertrekker.entity.Footage;
import com.shmilyou.snowbeertrekker.entity.News;
import com.shmilyou.snowbeertrekker.entity.Review;
import com.shmilyou.snowbeertrekker.entity.Video;
import com.shmilyou.snowbeertrekker.service.FootageService;
import com.shmilyou.snowbeertrekker.service.NewsService;
import com.shmilyou.snowbeertrekker.service.ReviewService;
import com.shmilyou.snowbeertrekker.service.VideoService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    ReviewService reviewService;
    @Autowired
    FootageService footageService;
    @Autowired
    VideoService videoService;
    @Autowired
    NewsService newsService;

    @RequestMapping(value = {"/", "index", "index.html"})
    public String index() {
        return "index";
    }

    @RequestMapping("review")
    public String review(ModelMap modelMap) {
        List<Review> reviews = reviewService.findAll();
        modelMap.addAttribute("reviews", reviews);
        return "review";
    }

    @RequestMapping("footage")
    public ModelAndView footage(ModelAndView modelAndView) {
        List<Footage> footages = footageService.findAll();
        modelAndView.addObject("footages", footages);
        modelAndView.setViewName("footage");
        return modelAndView;
    }

    @RequestMapping("video")
    public String video(ModelMap modelMap) {
        List<Video> videos = videoService.findAll();
        modelMap.addAttribute("videos", videos);
        return "video";
    }

    @RequestMapping("about")
    public String about() {
        return "about";
    }

    @RequestMapping("news")
    public String news(){
        return "news";
    }

    @RequestMapping("sales")
    public String sales(){
        return "sales";
    }

    @RequestMapping("work")
    public String work(){
        return "work";
    }

    @RequestMapping("topNews")
    public String topNews(ModelMap map){
        List<News> news = newsService.findAll();
        map.addAttribute("news",news);
        return "top_news";
    }

    @RequestMapping("display")
    public String display(@Param("id")Long id,ModelMap modelMap){
        News news = newsService.findOne(Long.class, id);
        modelMap.addAttribute("news",news);
        return "display";
    }
}

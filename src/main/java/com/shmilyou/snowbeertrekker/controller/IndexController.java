package com.shmilyou.snowbeertrekker.controller;

import com.shmilyou.snowbeertrekker.entity.*;
import com.shmilyou.snowbeertrekker.service.*;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    @Autowired
    AllianceService allianceService;
    @Autowired
    UniversityAllianceService universityAllianceService;
    @Autowired
    SalesService salesService;

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
    public String about(HttpSession session,ModelMap map) throws IOException {
        String realPath = session.getServletContext().getRealPath("/");
        File file=new File(realPath+"static/about.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();
        String fileStr=new String(bytes,"UTF-8");
        map.addAttribute("aboutStr",fileStr);
        return "about";
    }

    @RequestMapping("news")
    public String news(){
        return "news";
    }

    @RequestMapping("sales")
    public String sales(ModelMap map){
        List<Sales> sales = salesService.findAll();
        map.addAttribute("sales",sales);
        return "sales";
    }

    @RequestMapping("alliance")
    public String work(ModelMap modelMap){
        List<Alliance> alliances = allianceService.findAll();
        modelMap.addAttribute("alliances",alliances);
        return "alliance";
    }

    @RequestMapping(name = "universityAlliance",method = RequestMethod.GET)
    public String universityAlliance(){
        return "university_alliance";
    }

    @RequestMapping(name = "universityAlliance",method = RequestMethod.POST)
    @ResponseBody
    public String universityAlliancePost(HttpServletRequest request, UniversityAlliance universityAlliance){
        logger.info("==========="+universityAlliance.getJob());
        //response.setContentType("text/html;charset=UTF-8");   这句在@ResponseBody下是没用的，因为web.xml中只解决了post请求，而此注解是get请求需要使用注解中的produces

        universityAllianceService.addOne(universityAlliance);

        String baseHref = request.getScheme()+"://"+request.getServerName()+":" + request.getServerPort() + request.getContextPath()+"/";     //baseHref=http://localhost:8080/snow/
        //return "<script>alert('申请成功!!');window.location.href='index';</script>";  与下句相同
        return "<script>alert('申请成功!!');window.location.href='"+baseHref+"index"+"';</script>";
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

package com.shmilyou.snowbeertrekker.controller;

import com.shmilyou.snowbeertrekker.entity.*;
import com.shmilyou.snowbeertrekker.service.*;
import com.shmilyou.snowbeertrekker.utils.Constant;
import com.shmilyou.snowbeertrekker.utils.Tools;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    @Autowired
    UserService userService;

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
    public String about(HttpSession session, ModelMap map) throws IOException {
        //读取本地文件
        String realPath = session.getServletContext().getRealPath("/");
        File file = new File(realPath + "static/about.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();
        String fileStr = new String(bytes, "UTF-8");
        map.addAttribute("aboutStr", fileStr);
        return "about";
    }

    @RequestMapping("news")
    public String news() {
        return "news";
    }

    @RequestMapping("sales")
    public String sales(ModelMap map) {
        List<Sales> sales = salesService.findAll();
        map.addAttribute("sales", sales);
        return "sales";
    }

    @RequestMapping("alliance")
    public String work(ModelMap modelMap) {
        List<Alliance> alliances = allianceService.findAll();
        modelMap.addAttribute("alliances", alliances);
        return "alliance";
    }

    @RequestMapping(value = "universityAlliance", method = RequestMethod.GET)
    public String universityAlliance() {
        return "university_alliance";
    }

    @RequestMapping(value = "universityAlliance", method = RequestMethod.POST)
    @ResponseBody
    public String universityAlliancePost(HttpServletRequest request, UniversityAlliance universityAlliance) {
        logger.info("===========" + universityAlliance.getJob());
        //response.setContentType("text/html;charset=UTF-8");   这句在@ResponseBody下是没用的，因为web.xml中只解决了post请求，而此注解是get请求需要使用注解中的produces

        //添加帐号
        String user_id = request.getParameter("user_id");
        if (!StringUtils.isEmpty(user_id)) {
            User user = new User();
            user.setId(Long.valueOf(user_id));
            universityAlliance.setUser(user);
        }
        universityAllianceService.addOne(universityAlliance);

        String baseHref = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";     //baseHref=http://localhost:8080/snow/
        //return "<script>alert('申请成功!!');window.location.href='index';</script>";  与下句相同
        return "<script>alert('申请成功!!');window.location.href='" + baseHref + "index" + "';</script>";
    }


    @RequestMapping("topNews")
    public String topNews(ModelMap map) {
        List<News> news = newsService.findAll();
        map.addAttribute("news", news);
        return "top_news";
    }

    @RequestMapping("display")
    public String display(@Param("id") Long id, ModelMap modelMap) {
        News news = newsService.findOne(Long.class, id);
        modelMap.addAttribute("news", news);
        return "display";
    }

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String registerPage(ModelMap modelMap) {
        modelMap.addAttribute("user", new User());
        return "register";
    }

    @RequestMapping(value = "register", method = RequestMethod.POST)
    public String register(@ModelAttribute("user") User user, @RequestParam("photoFile") MultipartFile file, HttpSession session) throws IOException {
        String fileName = file.getOriginalFilename();
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        if (".png".equals(fileType) || ".jpg".equals(fileType) || ".jpeg".equals(fileType)) {
            String saveFileName = UUID.randomUUID().toString() + fileType;
            String realPath = session.getServletContext().getRealPath("/");
            file.transferTo(new File(realPath + Constant.PICTURE + saveFileName));
            user.setPhoto(saveFileName);
        }
        userService.addOne(user);
        return "index";
    }

    @RequestMapping(value = "nullPoint")
    public String nullPoint() {
        throw new NullPointerException("空指针异常!!!");
    }

    @RequestMapping(value = "arrayIndexOut")
    public String arrayIndexOut() {
        throw new ArrayIndexOutOfBoundsException("数组越界!!!");
    }

    @RequestMapping(value = "illegalArgument")
    public String illegalArgument() {
        throw new IllegalArgumentException("参数非法!!!");
    }

    @ExceptionHandler(value = {IllegalArgumentException.class})
    public ModelAndView innerException(Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ex", Tools.printStackTraceToString(ex));
        modelAndView.setViewName("error/error2");
        return modelAndView;
    }

    @RequestMapping(value = "validUserId", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> validUserId(String userId) {
        User one = userService.findOne(Long.class, Long.valueOf(userId));
        Map<String, String> map = new HashMap<>();
        map.put("code", "100");
        map.put("msg", "bad");
        map.put("date", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        if (one == null) {
            map.put("code", "200");
            map.put("msg", "ok");
        }
        return map;
    }
}

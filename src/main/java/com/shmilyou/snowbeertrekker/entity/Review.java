package com.shmilyou.snowbeertrekker.entity;

//往期回顾

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Review extends BasePojo {

    private Long id;

    private String title;

    private String content;

    private String photo;

    @DateTimeFormat(pattern = "yyyy-dd-MM")
    private Date date;

    public Review() {
    }

    public Review(String title, String content, String photo, Date date) {
        this.title = title;
        this.content = content;
        this.photo = photo;
        this.date = date;
    }

    //-------------------------属性-------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

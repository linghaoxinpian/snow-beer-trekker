package com.shmilyou.snowbeertrekker.entity;

public class News extends BasePojo {
    private Long id;

    private String title;

    private String content;

    public News() {
    }

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    //--------------------属性--------------------

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
}

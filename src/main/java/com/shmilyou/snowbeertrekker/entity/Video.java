package com.shmilyou.snowbeertrekker.entity;

public class Video {
    private Long id;

    private String name;

    private String src;

    public Video() {
    }
    public Video(String name,String src) {
        this.name = name;
        this.src=src;
    }
    //--------------属性--------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}

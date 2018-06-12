package com.shmilyou.snowbeertrekker.entity;

//幕后花絮
public class Footage extends BasePojo{
    private Long id;

    private String content;

    private String photo;

    public Footage() {
    }

    public Footage(String content, String photo) {
        this.content = content;
        this.photo = photo;
    }

    //-----------------属性-----------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

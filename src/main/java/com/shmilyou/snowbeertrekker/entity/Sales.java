package com.shmilyou.snowbeertrekker.entity;

public class Sales extends BasePojo {

    private Long id;

    private String name;

    private String picture;

    private int total;

    private int sold;

    public Sales() {
    }

    public Sales(String name, String picture, int total, int sold) {
        this.name = name;
        this.picture = picture;
        this.total = total;
        this.sold = sold;
    }

    //-----------属性-----------

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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }
}

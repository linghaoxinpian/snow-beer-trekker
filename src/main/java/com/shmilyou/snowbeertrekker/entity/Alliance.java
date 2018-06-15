package com.shmilyou.snowbeertrekker.entity;

public class Alliance extends BasePojo {

    private Long id;

    private String company;

    private String logo;

    private String link;

    public Alliance() {
    }

    public Alliance(String company, String logo, String link) {
        this.company = company;
        this.logo = logo;
        this.link = link;
    }

    //-----------------属性-----------------
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}

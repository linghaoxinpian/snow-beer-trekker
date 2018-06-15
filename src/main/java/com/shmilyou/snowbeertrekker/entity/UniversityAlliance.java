package com.shmilyou.snowbeertrekker.entity;

import com.shmilyou.snowbeertrekker.entity.enums.Job;

public class UniversityAlliance extends BasePojo {
    private Long id;

    //社团名称
    private String associationName;

    //推荐社团名称
    private  String recommendAssociationName;

    //所属学校
    private String school;

    //负责人
    private String principal;

    //负责人联系方式
    private String principalContact;

    //负责人本站帐号
    //private User user;

    private int memberNumber;

    private String webSite;

     //社团微博地址
    private String weiboSite;

    //社团曾参加的活动/奖励
    private String activity;

    //指导老师
    private String advisor;

    //指导老师联系方式
    private String advisorContact;

    //负责人当前职业
    private Job job;

    public UniversityAlliance() {
    }

    public UniversityAlliance(String associationName, String school, int memberNumber, Job job) {
        this.associationName = associationName;
        this.school = school;
        this.memberNumber = memberNumber;
        this.job = job;
    }

    //-------------属性-------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAssociationName() {
        return associationName;
    }

    public void setAssociationName(String associationName) {
        this.associationName = associationName;
    }

    public String getRecommendAssociationName() {
        return recommendAssociationName;
    }

    public void setRecommendAssociationName(String recommendAssociationName) {
        this.recommendAssociationName = recommendAssociationName;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPrincipalContact() {
        return principalContact;
    }

    public void setPrincipalContact(String principalContact) {
        this.principalContact = principalContact;
    }

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getWeiboSite() {
        return weiboSite;
    }

    public void setWeiboSite(String weiboSite) {
        this.weiboSite = weiboSite;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getAdvisor() {
        return advisor;
    }

    public void setAdvisor(String advisor) {
        this.advisor = advisor;
    }

    public String getAdvisorContact() {
        return advisorContact;
    }

    public void setAdvisorContact(String advisorContact) {
        this.advisorContact = advisorContact;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}

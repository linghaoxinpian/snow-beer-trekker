package com.shmilyou.snowbeertrekker.entity;

public class User extends BasePojo {

    private Long id;

    private String name;

    private String idCard;

    private int sex;

    private String phone;

    private String email;

    private String address;

    private String city;

    //获知渠道
    private String knowWay;

    //历年是否参加过
    private int attended;

    //是否是户外俱乐部VIP
    private int outdoorClubVip;

    private String photo;

    public User() {
    }

    public User(String name,int sex,String knowWay, int attended, int outdoorClubVip) {
        this.name = name;
        this.sex=sex;
        this.knowWay=knowWay;
        this.attended = attended;
        this.outdoorClubVip = outdoorClubVip;
    }

    public User(String name,int sex, String idCard, String phone, String email, String address, String city, String knowWay, int attended, int outdoorClubVip, String photo) {
        this.id = id;
        this.name = name;
        this.sex=sex;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.knowWay = knowWay;
        this.attended = attended;
        this.outdoorClubVip = outdoorClubVip;
        this.photo = photo;
    }

    //--------------------属性--------------------

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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getKnowWay() {
        return knowWay;
    }

    public void setKnowWay(String knowWay) {
        this.knowWay = knowWay;
    }

    public int getAttended() {
        return attended;
    }

    public void setAttended(int attended) {
        this.attended = attended;
    }

    public int getOutdoorClubVip() {
        return outdoorClubVip;
    }

    public void setOutdoorClubVip(int outdoorClubVip) {
        this.outdoorClubVip = outdoorClubVip;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}

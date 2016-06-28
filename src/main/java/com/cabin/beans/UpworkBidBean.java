package com.cabin.beans;

import com.cabin.entity.Saler;
import com.cabin.entity.UpworkBid;

public class UpworkBidBean {

    private Integer id;
    private Saler saler;
    private String comment;
    private String date;
    private String updatedDate;
    private String url;
    private String account;

    public static UpworkBidBean toBean(UpworkBid bid) {
        UpworkBidBean bean = new UpworkBidBean();
        bean.setId(bid.getId());
        bean.setSaler(bid.getSaler());
        bean.setComment(bid.getComment());
        bean.setDate(bid.getDate().toString());
        bean.setUpdatedDate(bid.getUpdatedDate().toString());
        bean.setUrl(bid.getUrl());
        bean.setAccount(bid.getAccount());
        return bean;
    }

    //getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Saler getSaler() {
        return saler;
    }

    public void setSaler(Saler saler) {
        this.saler = saler;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}

package com.cabin.beans;

import com.cabin.entity.Saler;
import com.cabin.entity.UpworkBid;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

}

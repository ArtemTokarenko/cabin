package com.cabin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "UPWORKBID")
public class UpworkBid {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SALER_ID")
    private Saler saler;

    @Column(name = "COMMENT")
    private String comment;

    @Column(name = "DATE")
    private Date date = new Date();

    @Column(name = "UPDATED_DATE")
    private Date updatedDate = new Date();

    @Column(name = "URL")
    private String url;

    @Column(name = "account")
    private String account;


}

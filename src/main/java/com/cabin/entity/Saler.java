package com.cabin.entity;

import com.cabin.enums.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "SALER")
@Getter
@Setter
public class Saler {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FIRSTNAME")
    private String firstname;

    @Column(name = "LASTNAME")
    private String lastname;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String phonenumber;

    @Column(name = "ROLE", nullable = false)
    @Enumerated(value = EnumType.ORDINAL)
    private Role role;

    @OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.REMOVE, CascadeType.PERSIST }, mappedBy = "saler")
    private List<UpworkBid> upworkBidList;

}

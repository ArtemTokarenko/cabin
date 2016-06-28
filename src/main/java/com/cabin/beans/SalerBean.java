package com.cabin.beans;

import com.cabin.entity.Saler;
import com.cabin.entity.UpworkBid;
import com.cabin.enums.Role;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SalerBean {

    private Integer id;
    private String firstname;
    private String lastname;
    private String login;
    private String password;
    private String email;
    private String phonenumber;
    private Role role;
    private List<UpworkBid> upworkBidList;
    //123
    public static SalerBean toBean(Saler saler) {
        SalerBean bean = new SalerBean();
        bean.setId(saler.getId());
        bean.setFirstname(saler.getFirstname());
        bean.setLastname(saler.getLastname());
        bean.setLogin(saler.getLogin());
        bean.setPassword(saler.getPassword());
        bean.setEmail(saler.getEmail());
        bean.setPhonenumber(saler.getPhonenumber());
        bean.setRole(saler.getRole());
        bean.setUpworkBidList(saler.getUpworkBidList());
        return bean;
    }

}

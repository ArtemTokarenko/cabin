package com.cabin.service.interfaces;

import com.cabin.beans.SalerBean;

import java.util.List;

public interface SalerService {

    List<SalerBean> getAll();

    SalerBean getByLogin(String login);

    SalerBean getByEmail(String email);

}

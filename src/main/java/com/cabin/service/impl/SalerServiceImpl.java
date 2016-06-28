package com.cabin.service.impl;

import com.cabin.beans.SalerBean;
import com.cabin.entity.Saler;
import com.cabin.repository.SalerRepository;
import com.cabin.service.interfaces.SalerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SalerServiceImpl implements SalerService {

    @Autowired
    private SalerRepository salerRepository;

    @Override
    public List<SalerBean> getAll() {
        List<SalerBean> salerBeanList = new ArrayList();
        List<Saler> salerList = salerRepository.findAll();
        salerList.forEach(s -> salerBeanList.add(SalerBean.toBean(s)));
        return salerBeanList;
    }

    @Override
    public SalerBean getByLogin(String login) {
        Saler saler = salerRepository.getByLogin(login);
        SalerBean salerBean = SalerBean.toBean(saler);
        return salerBean;
    }

    @Override
    public SalerBean getByEmail(String email) {
        Saler saler = salerRepository.getByEmail(email);
        SalerBean salerBean = SalerBean.toBean(saler);
        return salerBean;
    }

    @Override
    public void add(String login, String password) {
        Saler saler = new Saler();
        saler.setLogin(login);
        saler.setPassword(password);
        salerRepository.save(saler);


    }

    public void update(SalerBean salerBean) {
        Saler saler;
        saler = salerRepository.findOne(salerBean.getId());
        saler.setFirstname(salerBean.getFirstname());
        saler.setLastname(saler.getLastname());
        saler.setEmail(salerBean.getEmail());
        saler.setPassword(salerBean.getPassword());
        saler.setPhonenumber(salerBean.getPhonenumber());
        salerRepository.save(saler);
    }

    @Override
    public void delete(Integer id) {
        salerRepository.delete(id);
    }
}

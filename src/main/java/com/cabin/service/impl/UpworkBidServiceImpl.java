package com.cabin.service.impl;

import com.cabin.beans.UpworkBidBean;
import com.cabin.entity.Saler;
import com.cabin.entity.UpworkBid;
import com.cabin.repository.UpworkBidRepository;
import com.cabin.service.interfaces.UpworkBidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UpworkBidServiceImpl implements UpworkBidService {

    @Autowired
    private UpworkBidRepository upworkBidRepository;

    @Override
    public List<UpworkBidBean> getBySaler(Saler saler) {
        List<UpworkBidBean> upworkBidBeanList = new ArrayList<>();
        List<UpworkBid> upworkBidList = upworkBidRepository.getBySaler(saler);
        upworkBidList.forEach(u -> upworkBidBeanList.add(UpworkBidBean.toBean(u)));
        return upworkBidBeanList;
    }

    @Override
    public List<UpworkBidBean> getByComment(String comment) {
        List<UpworkBidBean> upworkBidBeanList = new ArrayList<>();
        List<UpworkBid> upworkBidList = upworkBidRepository.getByComment(comment);
        upworkBidList.forEach(u -> upworkBidBeanList.add(UpworkBidBean.toBean(u)));
        return upworkBidBeanList;
    }

    @Override
    public List<UpworkBidBean> getByDate(Date date) {
        List<UpworkBidBean> upworkBidBeanList = new ArrayList<>();
        List<UpworkBid> upworkBidList = upworkBidRepository.getByDate(date);
        upworkBidList.forEach(u -> upworkBidBeanList.add(UpworkBidBean.toBean(u)));
        return upworkBidBeanList;
    }

    @Override
    public List<UpworkBidBean> getByUpdatedDate(Date date) {
        List<UpworkBidBean> upworkBidBeanList = new ArrayList<>();
        List<UpworkBid> upworkBidList = upworkBidRepository.getByUpdatedDate(date);
        upworkBidList.forEach(u -> upworkBidBeanList.add(UpworkBidBean.toBean(u)));
        return upworkBidBeanList;
    }

    @Override
    public UpworkBidBean getByUrl(String url) {
        UpworkBidBean upworkBidBean = UpworkBidBean.toBean(upworkBidRepository.getByUrl(url));
        return upworkBidBean;
    }

    @Override
    public List<UpworkBidBean> getBySalerAndDateBetween(Saler saler, Date dateFrom, Date dateTo) {
        List<UpworkBidBean> upworkBidBeanList = new ArrayList<>();
        List<UpworkBid> upworkBidList = upworkBidRepository.getBySalerAndDateBetween(saler, dateFrom, dateTo);
        upworkBidList.forEach(u -> upworkBidBeanList.add(UpworkBidBean.toBean(u)));
        return upworkBidBeanList;
    }

    @Override
    public List<UpworkBidBean> getBySalerAndUpdatedDateBetween(Saler saler, Date dateFrom, Date dateTo) {
        List<UpworkBidBean> upworkBidBeanList = new ArrayList<>();
        List<UpworkBid> upworkBidList = upworkBidRepository.getBySalerAndUpdatedDateBetween(saler, dateFrom, dateTo);
        upworkBidList.forEach(u -> upworkBidBeanList.add(UpworkBidBean.toBean(u)));
        return upworkBidBeanList;
    }

    @Override
    public List<UpworkBidBean> getAllBetweenDate(Date dateFrom, Date dateTo) {
        List<UpworkBidBean> upworkBidBeanList = new ArrayList<>();
        List<UpworkBid> upworkBidList = upworkBidRepository.getAllBetweenDate(dateFrom, dateTo);
        upworkBidList.forEach(u -> upworkBidBeanList.add(UpworkBidBean.toBean(u)));
        return upworkBidBeanList;
    }
}

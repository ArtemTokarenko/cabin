package com.cabin.service.interfaces;

import com.cabin.beans.UpworkBidBean;
import com.cabin.entity.Saler;
import com.cabin.entity.UpworkBid;

import java.util.Date;
import java.util.List;

public interface UpworkBidService {

    void add (UpworkBid upworkBid);

    void update (UpworkBid upworkBid);

    void delete (Integer id);

    List<UpworkBidBean> getAll();

    List<UpworkBidBean> getBySaler(Integer salerId);

    List<UpworkBidBean> getByComment(String comment);

    List<UpworkBidBean> getByDate(Date date);

    List<UpworkBidBean> getByUpdatedDate(Date date);

    UpworkBidBean getByUrl(String url);

    List<UpworkBidBean> getBySalerAndDateBetween(Integer salerId, Date dateFrom, Date dateTo);

    List<UpworkBidBean> getBySalerAndUpdatedDateBetween(Integer salerId, Date dateFrom, Date dateTo);

    List<UpworkBidBean> getAllBetweenDate(Date dateFrom, Date dateTo);



}

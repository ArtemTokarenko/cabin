package com.cabin.service.interfaces;

import com.cabin.beans.UpworkBidBean;
import com.cabin.entity.Saler;

import java.util.Date;
import java.util.List;

public interface UpworkBidService {

    List<UpworkBidBean> getBySaler(Saler saler);

    List<UpworkBidBean> getByComment(String comment);

    List<UpworkBidBean> getByDate(Date date);

    List<UpworkBidBean> getByUpdatedDate(Date date);

    UpworkBidBean getByUrl(String url);

    List<UpworkBidBean> getBySalerAndDateBetween(Saler saler, Date dateFrom, Date dateTo);

    List<UpworkBidBean> getBySalerAndUpdatedDateBetween(Saler saler, Date dateFrom, Date dateTo);

    List<UpworkBidBean> getAllBetweenDate(Date dateFrom, Date dateTo);

}

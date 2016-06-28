package com.cabin.controller;

import com.cabin.beans.UpworkBidBean;
import com.cabin.entity.UpworkBid;
import com.cabin.service.interfaces.UpworkBidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/upworkBid")
@ResponseBody
public class UpworkBidController {

    @Autowired
    private UpworkBidService upworkBidService;

    @RequestMapping("/add")
    public void add(@ModelAttribute UpworkBid bid) {
        upworkBidService.add(bid);
    }

    @RequestMapping("/update")
    public void update(@ModelAttribute UpworkBid bid) {
        upworkBidService.update(bid);
    }

    @RequestMapping("/delete")
    public void delte(@RequestParam(value = "id") Integer id) {
        upworkBidService.delete(id);
    }

    @RequestMapping("/getBySaler")
    public List<UpworkBidBean> getBidsBySaler(@RequestParam(value = "salerId") Integer salerId) {
        return upworkBidService.getBySaler(salerId);
    }

    @RequestMapping("/getByComment")
    public List<UpworkBidBean> getBidsBySaler(@RequestParam(value = "comment") String comment) {
        return upworkBidService.getByComment(comment);
    }

    @RequestMapping("/getByDate")
    public List<UpworkBidBean> getBidsByDate(@RequestParam(value = "date") Date date) {
        return upworkBidService.getByDate(date);
    }

    @RequestMapping("/getByUpdateDate")
    public List<UpworkBidBean> getBidsByUpdateDate(@RequestParam(value = "date") Date date) {
        return upworkBidService.getByUpdatedDate(date);
    }

    @RequestMapping("/getByUrl")
    public UpworkBidBean getBidsByUrl(@RequestParam(value = "url") String url) {
        return upworkBidService.getByUrl(url);
    }

    @RequestMapping("/getBySalerAndDateBetween")
    public List<UpworkBidBean> getBidsBySalerAndDateBetween(@RequestParam(value = "salerId") Integer salerId,
            @RequestParam(value = "dateFrom") Date dateFrom, @RequestParam(value = "dateTo") Date dateTo) {
        return upworkBidService.getBySalerAndDateBetween(salerId, dateFrom, dateTo);
    }

    @RequestMapping("/getBySalerAndUpdatedDateBetween")
    public List<UpworkBidBean> getBidsBySalerAndUpdatedDateBetween(@RequestParam(value = "salerId") Integer salerId,
            @RequestParam(value = "dateFrom") Date dateFrom, @RequestParam(value = "dateTo") Date dateTo) {
        return upworkBidService.getBySalerAndUpdatedDateBetween(salerId, dateFrom, dateTo);
    }

    @RequestMapping("/getAllBetweenDate")
    public List<UpworkBidBean> getAllBetweenDate(
            @RequestParam(value = "dateFrom") Date dateFrom, @RequestParam(value = "dateTo") Date dateTo) {
        return upworkBidService.getAllBetweenDate(dateFrom, dateTo);
    }
}

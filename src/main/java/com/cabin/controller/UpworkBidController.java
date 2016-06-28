package com.cabin.controller;

import com.cabin.beans.UpworkBidBean;
import com.cabin.entity.UpworkBid;
import com.cabin.service.interfaces.UpworkBidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/upworkBid")
@ResponseBody
public class UpworkBidController {

    @Autowired
    private UpworkBidService upworkBidService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@ModelAttribute UpworkBid bid) {
        upworkBidService.add(bid);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void update(@ModelAttribute UpworkBid bid) {
        upworkBidService.update(bid);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void delete(@RequestParam(value = "id") Integer id) {
        upworkBidService.delete(id);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<UpworkBidBean> getAll() {
        return upworkBidService.getAll();
    }

    @RequestMapping(value = "/getBySaler", method = RequestMethod.GET)
    public List<UpworkBidBean> getBidsBySaler(@RequestParam(value = "salerId") Integer salerId) {
        return upworkBidService.getBySaler(salerId);
    }

    @RequestMapping(value = "/getByComment", method = RequestMethod.GET)
    public List<UpworkBidBean> getBidsBySaler(@RequestParam(value = "comment") String comment) {
        return upworkBidService.getByComment(comment);
    }

    @RequestMapping(value = "/getByDate", method = RequestMethod.GET)
    public List<UpworkBidBean> getBidsByDate(@RequestParam(value = "date") Date date) {
        return upworkBidService.getByDate(date);
    }

    @RequestMapping(value = "/getByUpdateDate", method = RequestMethod.GET)
    public List<UpworkBidBean> getBidsByUpdateDate(@RequestParam(value = "date") Date date) {
        return upworkBidService.getByUpdatedDate(date);
    }

    @RequestMapping(value = "/getByUrl", method = RequestMethod.GET)
    public UpworkBidBean getBidsByUrl(@RequestParam(value = "url") String url) {
        return upworkBidService.getByUrl(url);
    }

    @RequestMapping(value = "/getBySalerAndDateBetween", method = RequestMethod.GET)
    public List<UpworkBidBean> getBidsBySalerAndDateBetween(@RequestParam(value = "salerId") Integer salerId,
            @RequestParam(value = "dateFrom") Date dateFrom, @RequestParam(value = "dateTo") Date dateTo) {
        return upworkBidService.getBySalerAndDateBetween(salerId, dateFrom, dateTo);
    }

    @RequestMapping(value = "/getBySalerAndUpdatedDateBetween", method = RequestMethod.GET)
    public List<UpworkBidBean> getBidsBySalerAndUpdatedDateBetween(@RequestParam(value = "salerId") Integer salerId,
            @RequestParam(value = "dateFrom") Date dateFrom, @RequestParam(value = "dateTo") Date dateTo) {
        return upworkBidService.getBySalerAndUpdatedDateBetween(salerId, dateFrom, dateTo);
    }

    @RequestMapping(value = "/getAllBetweenDate", method = RequestMethod.GET)
    public List<UpworkBidBean> getAllBetweenDate(
            @RequestParam(value = "dateFrom") Date dateFrom, @RequestParam(value = "dateTo") Date dateTo) {
        return upworkBidService.getAllBetweenDate(dateFrom, dateTo);
    }
}

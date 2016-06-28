package com.cabin.controller;

import com.cabin.beans.SalerBean;
import com.cabin.service.impl.SalerServiceImpl;
import com.cabin.sites.ResponceContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/saler")



public class SalerController {

    @Autowired
    private SalerServiceImpl salerServiceImpl;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public ResponceContainer<List<SalerBean>> all(){
        ResponceContainer dataContainer = new ResponceContainer<>();
        dataContainer.setData(salerServiceImpl.getAll());
        dataContainer.setCode(200);
        return dataContainer;
    }
    @RequestMapping(value = "/getByLogin", method = RequestMethod.GET)
    @ResponseBody
    public ResponceContainer<List<SalerBean>> getByLogin(@RequestParam(value = "login", required = true) String login){
        ResponceContainer dataContainer = new ResponceContainer<>();
        dataContainer.setData(salerServiceImpl.getByLogin(login));
        dataContainer.setCode(200);
        return dataContainer;
    }
    @RequestMapping(value = "/getByEmail", method = RequestMethod.GET)
    @ResponseBody
    public ResponceContainer<List<SalerBean>> getByEmail(@RequestParam(value = "email", required = true) String email){
        ResponceContainer dataContainer = new ResponceContainer<>();
        dataContainer.setData(salerServiceImpl.getByEmail(email));
        dataContainer.setCode(200);
        return dataContainer;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponceContainer add(@RequestParam(value = "login", required = true) String login,
                                 @RequestParam(value = "password", required = true) String password){
        ResponceContainer dataContainer = new ResponceContainer<>();
        salerServiceImpl.add(login, password);
        dataContainer.setCode(200);
        return dataContainer;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public ResponceContainer update(@RequestBody SalerBean salerBean){
        ResponceContainer dataContainer = new ResponceContainer<>();
        salerServiceImpl.update(salerBean);
        dataContainer.setCode(200);
        return dataContainer;
    }


    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public ResponceContainer delete(@RequestParam(value = "id", required = true) Integer id){
        ResponceContainer dataContainer = new ResponceContainer<>();
        salerServiceImpl.delete(id);
        dataContainer.setCode(200);
        return dataContainer;
    }


}

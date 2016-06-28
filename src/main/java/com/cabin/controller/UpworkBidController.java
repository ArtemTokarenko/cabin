package com.cabin.controller;

import com.cabin.service.interfaces.UpworkBidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/upworkBid")
public class UpworkBidController {

    @Autowired
    private UpworkBidService upworkBidService;


}

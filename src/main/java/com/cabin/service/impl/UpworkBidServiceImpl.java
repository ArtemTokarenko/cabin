package com.cabin.service.impl;

import com.cabin.repository.UpworkBidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpworkBidServiceImpl {

    @Autowired
    private UpworkBidRepository upworkBidRepository;

}

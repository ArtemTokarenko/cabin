package com.cabin.service.impl;

import com.cabin.repository.UpworkBidRepository;
import com.cabin.service.interfaces.UpworkBidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UpworkBidServiceImpl implements UpworkBidService {

    @Autowired
    private UpworkBidRepository upworkBidRepository;

}

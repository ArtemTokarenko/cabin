package com.cabin.service.impl;

import com.cabin.repository.SalerRepository;
import com.cabin.service.interfaces.SalerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalerServiceImpl implements SalerService {

    @Autowired
    private SalerRepository salerRepositoryy;

}

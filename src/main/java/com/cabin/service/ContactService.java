package com.cabin.service;

import com.cabin.repository.ContactRepository;
import com.cabin.sites.ResponceContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Ультрамар on 22.06.2016.
 */
@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    //    public List<UpworkBid> getVideoByNameOrDescription(String query) {
    //        List<UpworkBid> tags = contactRepository.getContactByFirstname("%" + query + "%");
    //        return tags;
    //
    //    }

    public ResponceContainer deleteContact(int id) {
        ResponceContainer containerData = new ResponceContainer();

        containerData.setCode(200);
        containerData.setMessage("Success");
        return containerData;
    }

    public ResponceContainer findAllContact(int pageNumber, int pageSize) {
        ResponceContainer containerData = new ResponceContainer();

        containerData.setCode(200);
        containerData.setMessage("Success");
        return containerData;
    }

    public ResponceContainer getContactBySomeCredits(String name, String secondName, String email, String phoneNumber) {
        ResponceContainer containerData = new ResponceContainer();

        containerData.setCode(200);
        containerData.setMessage("Success");
        return containerData;
    }

}

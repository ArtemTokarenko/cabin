package com.cabin.service;

import com.cabin.dataBase.ContactDAO;
import com.cabin.entity.Contact;
import com.cabin.sites.ResponceContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Ультрамар on 22.06.2016.
 */
@Service
public class ContactService {

    @Autowired
    private ContactDAO contactDAO;

    public List<Contact> getVideoByNameOrDescription(String query) {
        List<Contact> tags = contactDAO.getContactByFirstname("%" + query + "%");
        return tags;

    }

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

package com.cabin.controller;

import com.cabin.beans.ContactBean;
import com.cabin.entity.Contact;
import com.cabin.service.ContactService;
import com.cabin.sites.ResponceContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    @ResponseBody
    public List<Contact> findByName(@RequestParam(value = "query", required = true) String query) {
        return contactService.getVideoByNameOrDescription(query);
    }

    @RequestMapping(value = "/deleteContact", method = RequestMethod.POST)
    @ResponseBody
    public ResponceContainer deleteContact(@RequestParam(value = "id", required = true) Integer id) {
        return contactService.deleteContact(id);
    }

    @RequestMapping(value = "/allContact", method = RequestMethod.GET)
    @ResponseBody
    public ResponceContainer<List<ContactBean>> videos(
            @RequestParam(value = "pageNumber", required = true) Integer pageNumber,
            @RequestParam(value = "pageSize", required = true) Integer pageSize) {
        return contactService.findAllContact(pageNumber, pageSize);
    }

    @RequestMapping(value = "/findContactBySomeCredits", method = RequestMethod.GET)
    @ResponseBody
    public ResponceContainer<List<ContactBean>> findContactBySomeCredits
            (@RequestParam(value = "name", required = false) String name,
                    @RequestParam(value = "secondName", required = false) String secondName,
                    @RequestParam(value = "email", required = false) String email,
                    @RequestParam(value = "phoneNumber", required = false) String phoneNumber) {
        return contactService.getContactBySomeCredits(name, secondName, email, phoneNumber);

    }

    @RequestMapping(value = "/s", method = RequestMethod.GET)
    @ResponseBody
    public String save() {
        return "12344";
    }

}

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

    //    //    @RequestMapping(value = "/find", method = RequestMethod.GET)
    //    //    @ResponseBody
    //    //    public List<UpworkBid> findByName(@RequestParam(value = "query", required = true) String query) {
    //    //        return contactService.getVideoByNameOrDescription(query);
    //    //    }
    //
    //    @RequestMapping(value = "/deleteContact", method = RequestMethod.POST)
    //    @ResponseBody
    //    public ResponceContainer deleteContact(@RequestParam(value = "id", required = true) Integer id) {
    //        return contactService.deleteContact(id);
    //    }
    //
    //    @RequestMapping(value = "/allContact", method = RequestMethod.GET)
    //    @ResponseBody
    //    public ResponceContainer<List<ContactBean>> videos(
    //            @RequestParam(value = "pageNumber", required = true) Integer pageNumber,
    //            @RequestParam(value = "pageSize", required = true) Integer pageSize) {
    //        return contactService.findAllContact(pageNumber, pageSize);
    //    }
    //
    //    //    @RequestMapping(value = "/findContactBySomeCredits", method = RequestMethod.GET)
    //    //    @ResponseBody
    //    //    public ResponceContainer<List<ContactBean>> findContactBySomeCredits
    //    //            (@RequestParam(value = "name", required = false) String name,
    //    //                    @RequestParam(value = "secondName", required = false) String secondName,
    //    //                    @RequestParam(value = "email", required = false) String email,
    //    //                    @RequestParam(value = "phoneNumber", required = false) String phoneNumber) {
    //    //        return contactService.getContactBySomeCredits(name, secondName, email, phoneNumber);
    //    //
    //    //    }
    //
    //    @RequestMapping(value = "/s", method = RequestMethod.GET)
    //    @ResponseBody
    //    public String save() {
    //        return "12344";
    //    }

}

package cabin.service;

import com.springapp.mvc.sites.ResponceContainer;
import org.springframework.stereotype.Service;

/**
 * Created by Ультрамар on 22.06.2016.
 */
@Service
public class contactService {
    public ResponceContainer addContact(String name, String secondName, String email, String phoneNumber){
        ResponceContainer containerData = new ResponceContainer();




        containerData.setCode(200);
        containerData.setMessage("Success");
        return containerData;
    }
    public ResponceContainer  deleteContact(int id){
        ResponceContainer containerData = new ResponceContainer();




        containerData.setCode(200);
        containerData.setMessage("Success");
        return containerData;
    }

    public ResponceContainer  findAllContact(int pageNumber,int pageSize){
        ResponceContainer containerData = new ResponceContainer();


        containerData.setCode(200);
        containerData.setMessage("Success");
        return containerData;
    }

    public ResponceContainer getContactBySomeCredits(String name,String secondName,String email,String phoneNumber){
        ResponceContainer containerData = new ResponceContainer();


        containerData.setCode(200);
        containerData.setMessage("Success");
        return containerData;
    }

}

package cabin.service;

import com.springapp.mvc.sites.ResponceContainer;
import org.springframework.stereotype.Service;

/**
 * Created by Ультрамар on 22.06.2016.
 */
@Service
public class salerService {
    public ResponceContainer deleteSaler(int id){
        ResponceContainer containerData = new ResponceContainer();




        containerData.setCode(200);
        containerData.setMessage("Success");
        return containerData;
    }


    public ResponceContainer  findSaler(int pageNumber,int pageSize, int idSaler){
        ResponceContainer containerData = new ResponceContainer();


        containerData.setCode(200);
        containerData.setMessage("Success");
        return containerData;
    }
}

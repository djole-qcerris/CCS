package carProject.CCS.controllers;

import carProject.CCS.dao.UserCredentialsDao;
import carProject.CCS.models.UserCredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api")
@RestController
public class ThirdPartyController {

    @Autowired
    private UserCredentialsDao userCredentialsDao;


    @GetMapping(path = "{name}")
    public UserCredentials getUserCredentials(@PathVariable("name") String name) {
        List<UserCredentials> ltp = userCredentialsDao.findByName(name);
        if(!ltp.isEmpty())
            return ltp.get(0);
        return null;
    }

}

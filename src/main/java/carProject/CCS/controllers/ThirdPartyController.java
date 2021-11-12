package carProject.CCS.controllers;

import carProject.CCS.dao.ThirdPartyDao;
import carProject.CCS.models.ThirdParty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api")
@RestController
public class ThirdPartyController {

    @Autowired
    private ThirdPartyDao thirdPartyDao;


    @GetMapping(path = "{name}")
    public ThirdParty getThirdParty(@PathVariable("name") String name) {
        List<ThirdParty> ltp = thirdPartyDao.findByName(name);
        if(!ltp.isEmpty())
            return ltp.get(0);
        return null;
    }

}

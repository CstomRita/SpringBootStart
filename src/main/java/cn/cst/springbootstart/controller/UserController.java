package cn.cst.springbootstart.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;
@RestController
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @RequestMapping(value="/getUser",method=RequestMethod.POST)
    public String getUser(@RequestBody String messgae){
        logger.info("===接收======="+messgae);
        return "OK";
    }

}

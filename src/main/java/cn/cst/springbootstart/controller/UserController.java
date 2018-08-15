package cn.cst.springbootstart.controller;


import cn.cst.springbootstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService; //不要忘記注入，否則就是一個空對象啊 嗷嗷嗷

    @RequestMapping(value="/getUser",method=RequestMethod.POST)
    public List<HashMap<String,Object>>  getUser(@RequestBody String messgae){
        logger.info("===接收======="+messgae);

        return  userService.getAll();
    }

}

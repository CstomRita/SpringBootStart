package cn.cst.springbootstart.service.impl;

import cn.cst.springbootstart.domain.User;
import cn.cst.springbootstart.mapper.UserMapper;
import cn.cst.springbootstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    public List<HashMap<String,Object>>   get(){
       return userMapper.findOne();
    }

    @Override
    public List<HashMap<String, Object>> getAll() {
        return userMapper.findAll();
    }
}

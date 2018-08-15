package cn.cst.springbootstart.service;

import cn.cst.springbootstart.domain.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


public interface UserService {
// 在這裡實現業務邏輯,是從數據庫中拿出數據之後再做其他的處理
    //EX 舉例把數據庫拿出的數據做一個更改返回
     //接口裡不要聲明public 因為一定不是public
     List<HashMap<String,Object>>   get();

     List<HashMap<String,Object>> getAll();
}

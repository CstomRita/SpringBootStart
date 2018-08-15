package cn.cst.springbootstart.mapper;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

// Mapper中設置的都是接口，僅僅設置一些查詢的方法和xml中SQL語句對應
// 具體的返回結果在Service通過接口實現結果
@Component
public interface UserMapper {

     List<HashMap<String,Object>> findOne();

     @Select("select * from User")
     List<HashMap<String,Object>> findAll();
}

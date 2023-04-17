package com.example.demo;

import com.example.demo.api.mapper.UserMapper;
import com.example.demo.api.pojo.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.util.*;

@SpringBootTest
class DemoApplicationTests {


    @Resource
    DataSource dataSource;


    @Resource
    private UserMapper userMapper;

    @Test
    void contextLoadsTwo() {
        List<User> list = userMapper.selectList(null);
        list.forEach(item-> System.out.println(item));
    }


    @Test
    void contextLoadsOne() throws Exception{
        System.out.println("获取的数据库连接为:"+dataSource.getConnection());
    }


    @Test
    void contextLoads() {

        List<Map<String,Integer>> list = new ArrayList<>();

        Map<String,Integer> map1= new HashMap();
        map1.put("id",1);

        Map<String,Integer> map2= new HashMap();
        map2.put("id",2);
        Map<String,Integer> map3= new HashMap();
        map3.put("id",3);
        Map<String,Integer> map4= new HashMap();
        map4.put("id",1);

        list.add(map1);
        list.add(map2);
        list.add(map3);
        list.add(map4);

        Map[] mapArray= new Map[list.size()];

        list.toArray(mapArray);

        System.out.println(Arrays.toString(mapArray));

        Map<String,Integer>[] result=method(mapArray,"id");

        System.out.println(Arrays.toString(result));

    }


    private  Map<String,Integer>[]  method(Map<String,Integer>[] mapArray,String key){

//        Map<String,Integer> temp= new HashMap();
//
//        for(Map<String,Integer> map:mapArray){
//            if(!temp.containsValue(map.get(key))){
//                temp.put(key,map.get(key).intValue());
//            }
//        }


        Map tempMap = new HashMap();
        for (Map originMap : mapArray) {
            String objHashCode = "";
//            for (Object key : keys) {
                String value = originMap.get(key) != null ? originMap.get(key).toString()  : "";
                objHashCode += value.hashCode();
//            }
            tempMap.put(objHashCode,originMap);
        }
        List valueList = new ArrayList<>(tempMap.values());




        Map[] resultArray= new Map[valueList.size()];

        valueList.toArray(resultArray);
        return resultArray;

    }

}

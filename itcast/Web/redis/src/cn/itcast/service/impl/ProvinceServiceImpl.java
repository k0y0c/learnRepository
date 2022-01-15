package cn.itcast.service.impl;

import cn.itcast.dao.ProvinceDao;
import cn.itcast.dao.impl.ProvinceDaoImpl;
import cn.itcast.domain.Province;
import cn.itcast.service.ProvinceService;
import cn.itcast.util.JedisPoolUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {

    //声明dao
    private ProvinceDao dao = new ProvinceDaoImpl();

    @Override
    public List<Province> findAll() {
        List<Province> list = dao.findAll();
        return list;
    }

    /**
     * 使用redis缓存
     * @return
     */
    @Override
    public String findAllJson() {
        //1.先从redis中查询数据
        //1.1获取redis客户端连接
        Jedis jedis = JedisPoolUtils.getJedis();
        String province_json = jedis.get("province");
        //2.判断province_json 数据是否为null
        if (province_json == null || province_json.length()==0){
            //redis中没有数据
            System.out.println("redis中没有数据，查询数据库....");
            //2.1 从数据库查询
            List<Province> list = dao.findAll();
            //2.2 将list序列化为json
            ObjectMapper mapper = new ObjectMapper();
            try {
                province_json = mapper.writeValueAsString(list);
                System.out.println("province_json"+province_json);      //province_json[{"id":1,"name":"北京"},{"id":2,"name":"上海"},{"id":3,"name":"广州"},{"id":4,"name":"陕西"}]
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            //2.3 将json数据存入redis
            jedis.set("province",province_json);
            //归还连接
            jedis.close();
        }else{
            //redis中有数据
            System.out.println("redis中有数据，查询缓存....");

        }


        return province_json;
    }

}

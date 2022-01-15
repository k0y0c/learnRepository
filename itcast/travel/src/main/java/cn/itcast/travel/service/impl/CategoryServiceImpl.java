package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.CategoryDao;
import cn.itcast.travel.dao.impl.CategoryDaoImpl;
import cn.itcast.travel.domain.Category;
import cn.itcast.travel.service.CategoryService;
import cn.itcast.travel.util.JedisUtil;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Tuple;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CategoryServiceImpl implements CategoryService {
    private CategoryDao categoryDao = new CategoryDaoImpl();

    @Override
    public List<Category> findAll() {
        //1.从redis中查询
        //1.1 获取jedis客户端
        Jedis jedis = JedisUtil.getJedis();
        //1.2 可使用sortedset排序查询
        //Set<String> categorys = jedis.zrange("category", 0, -1);    //set存放的是Cname的集合，不包括cid
        //1.3 因为旅游路线查询需要使用cid，所以在此处查询sortedset中的分数(cid)和值(cname)   Tuple对象中封装分数和值Tuple对象中封装分数和值
        Set<Tuple> categorys = jedis.zrangeWithScores("category", 0, -1);

        List<Category> list = null;
        //2.判断查询的集合是否为空
        if (categorys == null || categorys.size() == 0){
            //System.out.println("从数据库查询....");
            //3.如果为空，需要从数据库查询，在将数据存入redis
            //3.1 从数据库中查询
            list = categoryDao.findAll();
            //3.2 将集合数据存储到redis中 key为category,score为Cid，value为Cname
            for (int i = 0; i <list.size() ; i++) {
                jedis.zadd("category",list.get(i).getCid(),list.get(i).getCname());
            }
        }else {
            //System.out.println("从redis中查询....");
            //4.如果不为空，将其转为list集合
            list = new ArrayList<Category>();
            for (Tuple tuple : categorys) {
                Category category = new Category();
                category.setCname(tuple.getElement());
                category.setCid((int)tuple.getScore());
                list.add(category);
            }
        }
        return list;
    }
}

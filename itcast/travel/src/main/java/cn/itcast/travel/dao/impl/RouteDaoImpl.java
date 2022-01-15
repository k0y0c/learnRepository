package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteDao;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.List;

public class RouteDaoImpl implements RouteDao {
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public int findTotalCount(int cid,String rname) {
        //1.定义sql
        //String sql = "select count(*) from tab_route where cid = ?";
        //1. 定义sql模板
        String sql = "select count(*) from tab_route where 1=1 ";
        StringBuilder sb = new StringBuilder(sql);
        List params = new ArrayList();      //条件们
        //2. 判断参数是否有值
        if (cid != 0){
            sb.append(" and cid = ? ");
            params.add(cid);    //添加？对应的值
        }
        if (rname != null && rname.length() > 0){
            sb.append(" and rname like ? ");
            params.add("%"+rname+"%");      //添加？对应的值
        }
        sql = sb.toString();

        //3. 执行sql
        //public Object[] toArray(): 把集合中的元素，存储到数组中。
        return template.queryForObject(sql,Integer.class,params.toArray());
    }

    @Override
    public List<Route> findByPage(int cid, int start, int pageSize,String rname) {
        //1.定义sql
        //String sql = "select * from tab_route where cid = ? limit ? , ?";

        //1. 定义sql模板
        String sql = "select * from tab_route where 1 = 1 ";
        StringBuilder sb = new StringBuilder(sql);
        List params = new ArrayList();      //条件们
        //2. 判断参数是否有值
        if (cid != 0){
            sb.append(" and cid = ? ");
            params.add(cid);    //添加？对应的值
        }
        if (rname != null && rname.length() > 0){
            sb.append(" and rname like ? ");
            params.add("%"+rname+"%");      //添加？对应的值
        }

        sb.append(" limit ? , ? ");     //分页条件
        params.add(start);
        params.add(pageSize);

        sql = sb.toString();

        //2. 执行sql
        List<Route> list = template.query(sql, new BeanPropertyRowMapper<Route>(Route.class), params.toArray());
        return list;
    }

    @Override
    public Route findOne(int rid) {
        //1.定义sql
        String sql = "select * from tab_route where rid = ?";
        //2.执行sql
        Route route = template.queryForObject(sql, new BeanPropertyRowMapper<Route>(Route.class), rid);
        return route;
    }
}

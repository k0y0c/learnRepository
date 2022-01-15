package cn.itcast.travel.dao.impl;

import cn.itcast.travel.dao.RouteImgDao;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RouteImgDaoImpl implements RouteImgDao{
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());

    @Override
    public List<RouteImg> findByRid(int rid) {
        //1.定义sql
        String sql = "select * from tab_route_img where rid = ?";
        //2. 执行sql
        List<RouteImg> list = template.query(sql, new BeanPropertyRowMapper<RouteImg>(RouteImg.class), rid);
        return list;
    }
}

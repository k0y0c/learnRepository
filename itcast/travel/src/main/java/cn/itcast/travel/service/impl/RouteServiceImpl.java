package cn.itcast.travel.service.impl;

import cn.itcast.travel.dao.*;
import cn.itcast.travel.dao.impl.FavoriteDaoImpl;
import cn.itcast.travel.dao.impl.RouteDaoImpl;
import cn.itcast.travel.dao.impl.RouteImgDaoImpl;
import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.RouteImg;
import cn.itcast.travel.domain.Seller;
import cn.itcast.travel.service.RouteService;

import java.util.List;

public class RouteServiceImpl implements RouteService {
    private RouteDao routeDao = new RouteDaoImpl();
    private RouteImgDao routeImgDao = new RouteImgDaoImpl();
    private SellDao sellDao = new SellerDaoImpl();
    private FavoriteDao favoriteDao = new FavoriteDaoImpl();
    @Override
    public PageBean<Route> pageQuery(int cid, int currentPage, int pageSize,String rname) {
        //封装PageBean
        //1.创建PageBean
        PageBean<Route> pageBean = new PageBean<Route>();
        //2.添加数据
        //2.1 设置当前页码
        pageBean.setCurrentPage(currentPage);
        //2.2 设置每页显示条数
        pageBean.setPageSize(pageSize);
        //2.3 设置总记录数
        int totalCount = routeDao.findTotalCount(cid,rname);
        pageBean.setTotalCount(totalCount);
        //2.4 设置当前页显示的数据集合
        int start =(currentPage-1)*pageSize;   //开始的记录数
        List<Route> list = routeDao.findByPage(cid,start,pageSize,rname);
        pageBean.setList(list);
        //2.5 设置总页数 = 总记录数/每页显示条数
        int totalPage = totalCount%pageSize==0 ? totalCount/pageSize : (totalCount/pageSize)+1 ;
        pageBean.setTotalPage(totalPage);

        return pageBean;
    }

    @Override
    public Route findOne(String rid) {
        //1.根据id去route表中查询route对象
        Route route = routeDao.findOne(Integer.parseInt(rid));

        //2.根据route的id查询图片集合信息
        List<RouteImg> routeImgList = routeImgDao.findByRid(route.getRid());
        //2.2 将集合设置到route对象中
        route.setRouteImgList(routeImgList);

        //3.根据route的sid(商家id)查询商家对象
        Seller seller = sellDao.findBySid(route.getSid());
        route.setSeller(seller);
        //4.查询收藏次数
        int count = favoriteDao.findCountByRid(route.getRid());
        route.setCount(count);

        return route;
    }
}

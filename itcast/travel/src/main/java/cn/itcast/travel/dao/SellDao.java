package cn.itcast.travel.dao;

import cn.itcast.travel.domain.Seller;

public interface SellDao {
    /**
     * 根据sid查询商家信息
     * @param sid
     * @return
     */
    public Seller findBySid(int sid);
}

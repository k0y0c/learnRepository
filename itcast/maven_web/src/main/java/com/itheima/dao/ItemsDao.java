package com.itheima.dao;

import com.itheima.domain.Items;

import java.sql.SQLException;
import java.util.List;

public interface ItemsDao {
    public List<Items> findAll() ;
}

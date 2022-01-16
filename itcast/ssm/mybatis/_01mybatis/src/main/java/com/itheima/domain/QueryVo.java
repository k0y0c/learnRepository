package com.itheima.domain;

import java.io.Serializable;

/**
 * 封装多个对象，作为查询条件
 */
public class QueryVo implements Serializable{
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

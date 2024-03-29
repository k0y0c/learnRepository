package com.itheima.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 封装多个对象，作为查询条件
 */
public class QueryVo implements Serializable{
    private User user;
    private List<Integer> ids;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }
}

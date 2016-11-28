package com.test.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yqlbd on 2016/11/27.
 */
public class QueryVo implements Serializable {
    private List<Integer> idList;

    public List<Integer> getIdList() {
        return idList;
    }

    public void setIdList(List<Integer> idList) {
        this.idList = idList;
    }
}

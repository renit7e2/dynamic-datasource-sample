package com.cn.dynamic.ds.spring.sample.repository.service;


import com.cn.dynamic.ds.core.DsParam;
import com.cn.dynamic.ds.spring.sample.repository.po.UserPO;

/**
 * Created by kaizen on 2018/6/30.
 */
public interface UserService {
    int save(DsParam dsParam, UserPO userPO);

    UserPO queryByUid(DsParam dsParam, long uid);

    int updateNameByUid(DsParam dsParam, long uid, String name);

    int deleteByUid(DsParam dsParam, long uid);
}

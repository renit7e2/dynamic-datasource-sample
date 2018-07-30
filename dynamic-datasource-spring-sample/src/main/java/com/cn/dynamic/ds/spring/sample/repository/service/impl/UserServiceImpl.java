package com.cn.dynamic.ds.spring.sample.repository.service.impl;

import com.cn.dynamic.ds.core.DsParam;
import com.cn.dynamic.ds.core.annotation.DynamicDS;
import com.cn.dynamic.ds.spring.sample.UidDsRoutingAlgorithm;
import com.cn.dynamic.ds.spring.sample.repository.dao.UserDao;
import com.cn.dynamic.ds.spring.sample.repository.po.UserPO;
import com.cn.dynamic.ds.spring.sample.repository.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kaizen on 2018/6/30.
 */
@Service
@DynamicDS(UidDsRoutingAlgorithm.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public int save(DsParam dsParam, UserPO userPO) {
        return userDao.insert(userPO);
    }

    @Override
    public UserPO queryByUid(DsParam dsParam, long uid) {
        return userDao.queryByUid(uid);
    }

    @Override
    public int updateNameByUid(DsParam dsParam, long uid, String name) {
        return userDao.updateNameByUid(uid, name);
    }

    @Override
    public int deleteByUid(DsParam dsParam, long uid) {
        return userDao.deleteByUid(uid);
    }
}

package com.cn.dynamic.ds.spring.sample.repository.dao;


import com.cn.dynamic.ds.spring.sample.repository.po.UserPO;
import org.apache.ibatis.annotations.Param;

/**
 * Created by kaizen on 2018/6/30.
 */
public interface UserDao {
    int insert(@Param("item") UserPO userPO);

    UserPO queryByUid(@Param("uid") long uid);

    int updateNameByUid(@Param("uid") long uid, @Param("name") String name);

    int deleteByUid(@Param("uid") long uid);
}

package com.cn.dynamic.ds.spring.sample.repository.service;


import com.cn.dynamic.ds.core.DsParam;
import com.cn.dynamic.ds.spring.sample.BaseJunit4Test;
import com.cn.dynamic.ds.spring.sample.repository.po.UserPO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <pre>Created by Kaizen Xue on 2018/7/30.</pre>
 */
public class UserServiceTest extends BaseJunit4Test {
    @Autowired
    private UserService userService;

    @Test
    public void testSaveUser() {
        long uid = 122;
        String userName = "tom";
        System.err.println("save tom》》》》》》" + userService.save(new DsParam().buildParam(uid), new UserPO(uid, userName)));
        System.err.println("#########################");
        long uid1 = 121;
        String userName1 = "jerry";
        System.err.println("save jerry》》》》》》" + userService.save(new DsParam().buildParam(uid1), new UserPO(uid1, userName1)));
        System.err.println("#########################");
    }

    @Test
    public void testUpdateUserName() {
        long uid = 122;
        String changeName = "jerry";
        System.err.println("update 》》》》》》" + userService.updateNameByUid(new DsParam().buildParam(uid), uid, changeName));
        System.err.println("#########################");
    }

    @Test
    public void testQueryByUid() {
        long uid = 122;
        System.err.println("query 》》》》》》" + userService.queryByUid(new DsParam().buildParam(uid), uid));
        System.err.println("#########################");
    }

    @Test
    public void testDeleteUser() {
        long uid = 122;
        System.err.println("delete 》》》》》》" + userService.deleteByUid(new DsParam().buildParam(uid), uid));
        System.err.println("#########################");
    }
}
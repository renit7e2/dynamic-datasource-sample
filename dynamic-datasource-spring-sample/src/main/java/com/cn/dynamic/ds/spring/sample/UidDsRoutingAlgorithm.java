package com.cn.dynamic.ds.spring.sample;

import com.cn.dynamic.ds.core.DsParam;
import com.cn.dynamic.ds.core.algorithm.DsRoutingAlgorithm;

/**
 * uid对取模路由
 * <pre>Created by Kaizen Xue on 2018/7/30.</pre>
 */
public class UidDsRoutingAlgorithm implements DsRoutingAlgorithm<Long, Object> {
    @Override
    public String routing(DsParam<Long, Object> dsParam) {
        return "dataSource_" + dsParam.getParam() % 2;
    }
}

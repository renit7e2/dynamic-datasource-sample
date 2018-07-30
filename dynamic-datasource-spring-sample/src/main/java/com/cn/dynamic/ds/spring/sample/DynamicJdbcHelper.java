package com.cn.dynamic.ds.spring.sample;

import com.cn.dynamic.ds.core.holder.DataSourceHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

/**
 * <pre>Created by Kaizen Xue on 2018/7/30.</pre>
 */
@Component
@Slf4j
public class DynamicJdbcHelper implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        initTables();
    }

    private void initTables() {
        List<DataSource> allDataSource = DataSourceHolder.getHolder().getAllDataSource();
        for (DataSource dataSource : allDataSource) {
            JdbcTemplate jdbcTemplate = new JdbcTemplate();
            jdbcTemplate.setDataSource(dataSource);
            String createTableSql = "CREATE TABLE  IF NOT EXISTS `t_user` (\n" +
                    "\t`uid` INT NOT NULL,\n" +
                    "\t`name` VARCHAR(50) NOT NULL\n" +
                    ")\n" +
                    ";";
            jdbcTemplate.execute(createTableSql);
        }
    }


}

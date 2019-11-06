package com.config;

import com.zaxxer.hikari.HikariDataSource;
import org.beetl.sql.core.*;
import org.beetl.sql.core.db.DBStyle;
import org.beetl.sql.core.db.MySqlStyle;
import org.beetl.sql.ext.DebugInterceptor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;


@Configuration
public class DataSourceConfig {


    @Bean(name = "sqlManager")
    public SQLManager getSQLManager(@Qualifier("masterDataSource")  DataSource dataSource){
        ConnectionSource source = ConnectionSourceHelper.getSingle(dataSource);
        DBStyle mysql = new MySqlStyle();
        // sql语句放在classpagth的/sql 目录下
        SQLLoader loader = new ClasspathLoader("/sql");
        // 数据库命名跟java命名一样，所以采用DefaultNameConversion，还有一个是UnderlinedNameConversion，下划线风格的
        UnderlinedNameConversion nc = new  UnderlinedNameConversion();
        // 最后，创建一个SQLManager,DebugInterceptor 不是必须的，但可以通过它查看sql执行情况
        SQLManager sqlManager = new SQLManager(mysql,loader,source,nc,new Interceptor[]{new DebugInterceptor()});
        return sqlManager;
    }


    @Bean(name = "masterDataSource")
    public DataSource masterDataSource(Environment env) {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(env.getProperty("spring.datasource.master.url"));
        ds.setUsername(env.getProperty("spring.datasource.master.username"));
        ds.setPassword(env.getProperty("spring.datasource.master.password"));
        ds.setDriverClassName(env.getProperty("spring.datasource.master.driver-class-name"));
        return ds;
    }



    @Bean(name = "slaveDataSource")
    public DataSource slaveDataSource(Environment env) {
        HikariDataSource ds = new HikariDataSource();
        ds.setJdbcUrl(env.getProperty("spring.datasource.slave.url"));
        ds.setUsername(env.getProperty("spring.datasource.slave.username"));
        ds.setPassword(env.getProperty("spring.datasource.slave.password"));
        ds.setDriverClassName(env.getProperty("spring.datasource.slave.driver-class-name"));
        return ds;
    }

}

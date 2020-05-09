package com.unicompound.demo1.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by summer on 2016/11/25.
 */
@Configuration
@MapperScan(basePackages = "com.unicompound.demo1.mapper.mes", sqlSessionTemplateRef  = "mesSqlSessionTemplate")
public class DataSource2Config {

    @Bean(name = "mesDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.mes")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mesSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("mesDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        return bean.getObject();
    }

    @Bean(name = "mesTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("mesDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "mesSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("mesSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}

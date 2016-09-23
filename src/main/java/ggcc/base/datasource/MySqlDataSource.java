package ggcc.base.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "ggcc.repository.persistence")
public class MySqlDataSource {

    @Autowired
    private DataSourceConfig config;

    @Bean
    public DataSource dataSource() throws ClassNotFoundException {
        return DataSourceBuilder.create().
                username(config.getUsername()).password(config.getPassword()).
                url(config.getUrl()).
                type(config.getDataSourceClassName()).build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setTypeAliasesPackage("ggcc.domain");
        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
    }
}

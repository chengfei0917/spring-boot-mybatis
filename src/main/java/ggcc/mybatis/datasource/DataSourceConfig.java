package ggcc.mybatis.datasource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by gg on 15/8/29.
 */
@Component
@ConfigurationProperties(prefix = "mysql.datasource")
public class DataSourceConfig {

    private String url;

    private String username;

    private String password;

    private Class dataSourceClassName;

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Class getDataSourceClassName() {
        return dataSourceClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDataSourceClassName(Class dataSourceClassName) {
        this.dataSourceClassName = dataSourceClassName;
    }
}

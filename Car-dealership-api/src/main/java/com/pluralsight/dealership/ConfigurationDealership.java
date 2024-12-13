package com.pluralsight.dealership;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConfigurationDealership {
    private BasicDataSource basicDataSource;
    @Bean
    public DataSource dataSource(){
        return basicDataSource;
    }
    @Autowired
    public ConfigurationDealership(@Value("${datasource.url}") String url,
                                   @Value("${datasource.username}") String username,
                                   @Value("${datasource.url}") String password){
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);


    }


}

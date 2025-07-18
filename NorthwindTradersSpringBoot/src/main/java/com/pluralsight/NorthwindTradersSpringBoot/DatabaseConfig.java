package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class DatabaseConfig {
    private String username;
    private String password;
    private String url;

    public DatabaseConfig(){
        this.username = "user1";
        this.password = "password1234";
        this.url = "jdbc:mysql://localhost:3306/northwind";
    }

    public DatabaseConfig(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

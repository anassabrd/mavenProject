
package com.sms.mavenproject.models;

import java.io.Serializable;
import org.springframework.stereotype.Component;

@Component
public class User  implements Serializable{
    private int id;
    private String user;
    private String password;
    private String token;
    private String url;

    public User(int id, String user, String password, String token, String url) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.token = token;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public User(){
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public String getToken() {
        return token;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    
}

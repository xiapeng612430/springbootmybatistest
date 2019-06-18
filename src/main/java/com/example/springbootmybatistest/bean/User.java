package com.example.springbootmybatistest.bean;

import java.io.Serializable;

/**
 * Created by xianpeng.xia
 * on 2019-05-25 08:35
 */
public class User implements Serializable {
    private int id;
    private String loginName;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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
}

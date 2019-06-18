package com.example.springbootmybatistest.repository;

import com.example.springbootmybatistest.bean.User;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by xianpeng.xia
 * on 2019-05-25 08:37
 */
public interface UserRepository {

    @Insert("insert into tb_user(login_name,username,password) values(#{loginName},#{username},#{password})")
    int insertUser(User user);
}

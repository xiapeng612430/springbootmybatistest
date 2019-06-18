package com.example.springbootmybatistest;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootmybatistestApplication {

    public static void main(String[] args) {
        Map<String,String> map  = new HashMap<>();
        map.put(null,"a");
        map.put("a",null);
        System.out.println(map.get(null));
        System.out.println(map.get("a"));
        SpringApplication.run(SpringbootmybatistestApplication.class, args);
    }

}

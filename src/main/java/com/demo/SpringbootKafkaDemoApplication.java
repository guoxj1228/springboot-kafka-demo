package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootKafkaDemoApplication {

    //初始化系统属性
//    static {
//        System.setProperty("java.security.auth.login.config", "D:/ITCloud/sts/no-rush-parent/no-rush-discovery/src/main/resources/kafka_client_jaas.conf");
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaDemoApplication.class, args);
    }

}

package com.mengyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author mengyu
 * @Date 2021/9/25 16:55
 * @Version 1.0
 */
//@EnableConfigServer:声明配置中心
@SpringBootApplication
@EnableConfigServer
public class NativeConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NativeConfigServerApplication.class,args);
    }
}

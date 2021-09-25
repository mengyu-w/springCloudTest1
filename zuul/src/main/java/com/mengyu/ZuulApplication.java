package com.mengyu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author mengyu
 * @Date 2021/9/24 14:28
 * @Version 1.0
 */

//@EnableZuulProxy:包含了@EnableZuulServer，该类是网关的启动类。
//@EnableAutoConfiguration:可以帮助SpringBoot应用将所有符合条件的@Configuration配置加载到SpringBoot创建并使用的IOC容器中。
@EnableZuulProxy
@EnableAutoConfiguration
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}

package com.mengyu.feign.impl;

import com.mengyu.entity.Student;
import com.mengyu.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Author mengyu
 * @Date 2021/9/25 15:39
 * @Version 1.0
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中！";
    }
}

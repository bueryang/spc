package com.example.demo.service;

import org.springframework.stereotype.Component;

/**
 * Created by SMT26 on 2018/2/27.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

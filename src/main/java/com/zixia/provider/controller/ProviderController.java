package com.zixia.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author teng.wang1.o
 * @date 2019/8/9
 * @Description
 */
@RestController
public class ProviderController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",required = false)String name){
        System.out.println("提供者开始提供消费者需要的接口服务。。。。");
        return "hello "+name;
    }
}

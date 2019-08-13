package com.zixia.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author teng.wang1.o
 * @date 2019/8/9
 * @Description
 */
@RestController
@RefreshScope
public class ConfigController {

    @Value("${username:zixia}")
    private String username;

    @RequestMapping("/username")
    public String get() {
        return username;
    }
}

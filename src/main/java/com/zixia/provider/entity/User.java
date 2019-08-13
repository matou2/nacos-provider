package com.zixia.provider.entity;

import lombok.Data;

/**
 * @author teng.wang1.o
 * @date 2019/8/12
 * @Description
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}

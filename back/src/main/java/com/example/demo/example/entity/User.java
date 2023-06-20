package com.example.demo.example.entity;

import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user")
@Data
public class User extends BaseEntity {
    private String username;
    private String password;
    private Integer privilege;
    private String img;
    private String nikename;
    private String sex;
    private String tel;
    private Integer usefull;
}
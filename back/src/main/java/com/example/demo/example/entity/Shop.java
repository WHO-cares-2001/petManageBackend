package com.example.demo.example.entity;

import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("shop")
@Data
public class Shop extends BaseEntity {
    private String shopName;
    private String address;
    private String introduction;
    private String img;
}

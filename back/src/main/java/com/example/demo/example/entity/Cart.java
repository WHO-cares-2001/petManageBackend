package com.example.demo.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("cart")
@Data
public class Cart extends BaseEntity {
    private String id;
    private String userId;
    private String animalId;
    private String stuffId;
    private Integer number;
    private Integer goodsType;
    @TableField(exist = false)
    private String name;
    @TableField(exist = false)
    private String img;
    @TableField(exist = false)
    private Double pprice;
}
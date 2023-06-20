package com.example.demo.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("favor")
@Data
public class Favor extends BaseEntity {
    private String userId;
    private String animalId;
    private String stuffId;
    private Integer goodsId;
    @TableField(exist = false)
    private String name;
    @TableField(exist = false)
    private String img;
}
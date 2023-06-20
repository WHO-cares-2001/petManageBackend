package com.example.demo.example.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("orderitem")
@Data
public class Orders extends BaseEntity {
    private String number;
    private String userId;
    private String createTime;
    private String money;
    private String addressId;
    @TableField(exist = false)
    private String num;
    @TableField(exist = false)
    private String name;
    @TableField(exist = false)
    private String img;
}
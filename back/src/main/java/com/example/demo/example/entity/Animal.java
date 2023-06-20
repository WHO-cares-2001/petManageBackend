package com.example.demo.example.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("animal")
@Data
public class Animal extends BaseEntity {
    private String name;
    private String age;
    private String introduction;
    private String birth;
    private String img;
    @TableField(updateStrategy = FieldStrategy.IGNORED)
    private String videoId;
    private String sex;
    private Integer state;
    private Double price;
    private String shopId;
    private String typeId;
    @TableField(exist = false)
    private String shopName;
    @TableField(exist = false)
    private String videoName;
    @TableField(exist = false)
    private String typeName;
}
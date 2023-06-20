package com.example.demo.example.entity;
import com.baomidou.mybatisplus.annotation.TableField;
import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("stuff")
@Data
public class Stuff extends BaseEntity{
    private String shopId;
    private String stuffName;
    private String introduction;
    private Double price;
    private Integer state;
    private Integer number;
    private String imgs;
    @TableField(exist = false)
    private String shopName;}

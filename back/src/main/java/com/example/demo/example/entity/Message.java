package com.example.demo.example.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("message")
@Data
public class Message extends BaseEntity {
    private String userId;
    private String stuffId;
    private String content;
    private String createTime;
    private Integer level;
    @TableField(exist = false)
    private String stuffName;
    @TableField(exist = false)
    private String imgs;
    @TableField(exist = false)
    private String nikename;
    @TableField(exist = false)
    private String img;
}
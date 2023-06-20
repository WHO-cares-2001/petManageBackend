package com.example.demo.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("video")
@Data
public class Video extends BaseEntity {
    private String videoName;
    private String animalId;
    @TableField(exist = false)
    private String name;
}
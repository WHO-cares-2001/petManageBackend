package com.example.demo.example.entity;

import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("type")
@Data
public class Type extends BaseEntity {
    private String typeName;
    private String img;
    private String animalType;
}

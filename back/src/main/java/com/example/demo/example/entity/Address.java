package com.example.demo.example.entity;
import com.example.demo.common.base.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("address")
@Data
public class Address extends BaseEntity{
    private String addressName;
    private String tel;
    private String adress;
    private String userId;
    private Integer usefull;
    private String province;
    private Integer isDefault;
}

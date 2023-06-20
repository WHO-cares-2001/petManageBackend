package com.example.demo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.example.entity.Shop;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowShopMapper extends BaseMapper<Shop> {
    @Select("select * from shop")
    public List<Shop> getAllshop();
    @Select("select * from shop " +
            "where address like CONCAT('%',#{address},'%')")
    public List<Shop> getAllshops(String address);
}

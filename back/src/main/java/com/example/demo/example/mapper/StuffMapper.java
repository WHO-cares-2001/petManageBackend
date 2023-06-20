package com.example.demo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.example.entity.Stuff;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StuffMapper extends BaseMapper<Stuff> {
    @Select("SELECT stuff.*, shop.shop_name FROM stuff,shop " +
            "WHERE stuff.shop_id = shop.id")
    public List<Stuff> getAllstuff();
    @Select("SELECT stuff.*, shop.shop_name FROM stuff,shop " +
            "WHERE stuff.shop_id = shop.id AND stuff.shop_id=#{id}")
    public List<Stuff> getAllstuffByshopId(String id);
}

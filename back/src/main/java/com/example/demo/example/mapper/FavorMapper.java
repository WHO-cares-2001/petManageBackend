package com.example.demo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.example.entity.Favor;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FavorMapper extends BaseMapper<Favor> {
    @Select("SELECT favor.* ,IF(favor.goods_id=0,(select animal.name from animal where favor.animal_id = animal.id),(select stuff.stuff_name from stuff where favor.stuff_id = stuff.id))as name,"+
            "IF(favor.goods_id=0,(select animal.img from animal where favor.animal_id = animal.id),(select stuff.imgs from stuff where favor.stuff_id = stuff.id))as img "+
            "FROM favor "+
            "WHERE user_id= #{id} ")
    public List<Favor> getAllfavor(String id);
}

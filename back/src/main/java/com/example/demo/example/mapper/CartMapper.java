package com.example.demo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.example.entity.Cart;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CartMapper extends BaseMapper<Cart> {
    @Select("SELECT cart.* ,IF(cart.goods_type=0,(select animal.name from animal where cart.animal_id = animal.id)," +
            "(select stuff.stuff_name from stuff where cart.stuff_id = stuff.id))as name,"+
    "IF(cart.goods_type=0,(select animal.img from animal where cart.animal_id = animal.id)," +
            "(select stuff.imgs from stuff where cart.stuff_id = stuff.id))as img,"+
            "IF(cart.goods_type=0,(select animal.price from animal where cart.animal_id = animal.id)," +
            "(select stuff.price from stuff where cart.stuff_id = stuff.id))as pprice "+
    "FROM cart "+
    "WHERE user_id= #{id} ")
    public List<Cart> getAllcart(String id);
}

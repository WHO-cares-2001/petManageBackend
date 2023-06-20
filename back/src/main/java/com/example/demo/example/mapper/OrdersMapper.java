package com.example.demo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.example.entity.Orders;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrdersMapper extends BaseMapper<Orders> {
    @Select("SELECT orderitem.*,order_details.orderitem_id ,order_details.goods_id,order_details.num,order_details.state," +
            "IF(order_details.goods_id=0,(select animal.name from animal where order_details.animal_id = animal.id),(select stuff.stuff_name from stuff where order_details.stuff_id = stuff.id))as name," +
            "IF(order_details.goods_id=0,(select animal.img from animal where order_details.animal_id = animal.id),(select stuff.imgs from stuff where order_details.stuff_id = stuff.id))as img " +
            "FROM orderitem,order_details " +
            "WHERE user_id= #{id} and order_details.orderitem_id=orderitem.id")
    public List<Orders> getAllorders(String id);
    @Select("SELECT orderitem.*,order_details.orderitem_id ,order_details.goods_id,order_details.num,order_details.state," +
            "IF(order_details.goods_id=0,(select animal.name from animal where order_details.animal_id = animal.id),(select stuff.stuff_name from stuff where order_details.stuff_id = stuff.id))as name," +
            "IF(order_details.goods_id=0,(select animal.img from animal where order_details.animal_id = animal.id),(select stuff.imgs from stuff where order_details.stuff_id = stuff.id))as img " +
            "FROM orderitem,order_details " +
            "WHERE user_id= #{id} and order_details.orderitem_id=orderitem.id and order_details.state=#{state}")
    public List<Orders> getAllByStateOrders(String id,Integer state);
}

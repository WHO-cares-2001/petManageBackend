package com.example.demo.example.service;

import com.example.demo.example.entity.Orders;
import com.example.demo.example.mapper.OrdersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowOrdersService {
    @Autowired
    OrdersMapper ordersMapper;
    public List<Orders> getAllorders(String id)
    {
        return ordersMapper.getAllorders(id);
    }
    public List<Orders> getAllByStateOrders(String id,Integer state)
    {
        return ordersMapper.getAllByStateOrders(id,state);
    }
}

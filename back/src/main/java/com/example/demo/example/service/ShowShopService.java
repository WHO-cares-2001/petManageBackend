package com.example.demo.example.service;

import com.example.demo.example.entity.Shop;
import com.example.demo.example.mapper.ShowShopMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowShopService {
    @Autowired
    ShowShopMapper showshopMapper;
    public List<Shop> getAllshop()
    {
        return showshopMapper.getAllshop();
    }
    public List<Shop> getAllshops(String address)
    {
        return showshopMapper.getAllshops(address);
    }
}

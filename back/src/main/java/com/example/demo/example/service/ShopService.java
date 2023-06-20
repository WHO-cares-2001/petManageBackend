package com.example.demo.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.example.entity.Shop;

import java.util.List;


    public interface ShopService extends IService<Shop> {
    List<Shop> search(String shopName);
    Shop searchs(String id);
    Boolean add(Shop shop);
    Shop getByNames(String shopName);
    void deleteByIds(String id);
    void updata(Shop shop);
}

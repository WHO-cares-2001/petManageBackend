package com.example.demo.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.example.entity.Cart;

import java.util.List;


public interface CartService extends IService<Cart> {

    void updata(Cart cart);
    Boolean add(Cart cart);
    Cart getById(String userId,String stuffId);
    Cart getByIds(String userId,String animalId);
    void deleteByIds(String id);
    void addupdata(String id);
    void jianupdata(String id);
    void dels(String ids);
}

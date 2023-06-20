package com.example.demo.example.service;

import com.example.demo.example.entity.Cart;
import com.example.demo.example.mapper.CartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowCartService {
    @Autowired
    CartMapper cartMapper;
    public List<Cart> getAllcart(String id)
    {
        return cartMapper.getAllcart(id);
    }
}

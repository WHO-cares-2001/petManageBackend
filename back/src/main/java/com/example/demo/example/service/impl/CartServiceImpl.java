package com.example.demo.example.service.impl;

import com.example.demo.example.entity.Animal;
import com.example.demo.example.entity.Cart;
import com.example.demo.example.mapper.CartMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.example.service.CartService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements CartService {
    @Override
    public void updata(Cart cart) {
        cart.setNumber(cart.getNumber());
        this.updateById(cart);
    }
    @Override
    public Boolean add(Cart cart) {
        this.save(cart);
        return true;
    }
    @Override
    public Cart getById(String userId,String stuffId) {
        QueryWrapper<Cart> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_id",userId)
                .eq("stuff_id",stuffId);
        return this.getOne(queryWrapper);
    }
    @Override
    public Cart getByIds(String userId,String animalId) {
        QueryWrapper<Cart> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_id",userId)
                .eq("animal_id",animalId);
        return this.getOne(queryWrapper);
    }
    @Override
    public void deleteByIds(String id) {
        this.removeById(id);
    }
    @Override
    public void addupdata(String id) {
        Cart cart=this.getById(id);
        cart.setNumber(cart.getNumber()+1);
        this.updateById(cart);
    }
    @Override
    public void jianupdata(String id) {
        Cart cart=this.getById(id);
        if(cart.getNumber()>=2)
            cart.setNumber(cart.getNumber()-1);
        this.updateById(cart);
    }
    @Override
    public void dels(String ids){
        List<String> listIds=new ArrayList<>();
        String[] aryIds=ids.split(",");
        for(String id:aryIds)
        {
            listIds.add(id);
        }
        this.removeByIds(listIds);
    }
}


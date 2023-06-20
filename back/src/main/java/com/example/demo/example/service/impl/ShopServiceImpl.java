package com.example.demo.example.service.impl;

import com.example.demo.example.entity.Shop;
import com.example.demo.example.mapper.ShowShopMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.example.service.ShopService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl extends ServiceImpl<ShowShopMapper, Shop> implements ShopService {

    @Override
    public List<Shop> search(String shopName) {
        QueryWrapper<Shop> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("shop_name",shopName);
        return this.list(queryWrapper);
    }

    @Override
    public Shop searchs(String id) {
        QueryWrapper<Shop> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return this.getOne(queryWrapper);
    }

    @Override
    public Boolean add(Shop shop) {
        this.save(shop);
        return true;
    }
    @Override
    public Shop getByNames(String shopName) {
        QueryWrapper<Shop> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("shop_name",shopName);
        return this.getOne(queryWrapper);
    }
    @Override
    public void deleteByIds(String id) {
        this.removeById(id);
    }
    @Override
    public void updata(Shop shop) {
        shop.setShopName(shop.getShopName());
        shop.setImg("img/"+shop.getImg());
        shop.setIntroduction(shop.getIntroduction());
        shop.setAddress(shop.getAddress());
        this.updateById(shop);
    }
}


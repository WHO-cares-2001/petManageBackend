package com.example.demo.example.service.impl;

import com.example.demo.example.entity.Animal;
import com.example.demo.example.entity.Stuff;
import com.example.demo.example.mapper.StuffMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.example.service.StuffService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StuffServiceImpl extends ServiceImpl<StuffMapper, Stuff> implements StuffService {

    @Override
    public List<Stuff> search(String name) {
        QueryWrapper<Stuff> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("stuff_name",name);
        return this.list(queryWrapper);
    }

    @Override
    public Stuff searchById(String id) {
        QueryWrapper<Stuff> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return this.getOne(queryWrapper);
    }
    @Override
    public List<Stuff> searchShop(String shopId) {
        QueryWrapper<Stuff> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("shop_id",shopId);
        return this.list(queryWrapper);
    }
    @Override
    public Boolean add(Stuff stuff) {
        this.save(stuff);
        return true;
    }
    @Override
    public Stuff getByNames(String name) {
        QueryWrapper<Stuff> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("stuff_name",name);
        return this.getOne(queryWrapper);
    }
    @Override
    public void deleteByIds(String id) {
        this.removeById(id);
    }
    @Override
    public void updata(Stuff stuff) {
        stuff.setShopId(stuff.getShopId());
        stuff.setIntroduction(stuff.getIntroduction());
        stuff.setStuffName(stuff.getStuffName());
        stuff.setState(stuff.getState());
        stuff.setPrice(stuff.getPrice());
        stuff.setImgs("img/"+stuff.getImgs());
        this.updateById(stuff);
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


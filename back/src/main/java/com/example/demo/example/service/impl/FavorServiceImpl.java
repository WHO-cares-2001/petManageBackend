package com.example.demo.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.example.entity.Favor;
import com.example.demo.example.mapper.FavorMapper;
import com.example.demo.example.service.FavorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FavorServiceImpl extends ServiceImpl<FavorMapper, Favor> implements FavorService {
    @Override
    public Boolean add(Favor favor) {
        this.save(favor);
        return true;
    }
    @Override
    public Favor getById(String userId,String stuffId) {
        QueryWrapper<Favor> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_id",userId)
                .eq("stuff_id",stuffId);
        return this.getOne(queryWrapper);
    }
    @Override
    public Favor getByIds(String userId,String animalId) {
        QueryWrapper<Favor> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_id",userId)
                .eq("animal_id",animalId);
        return this.getOne(queryWrapper);
    }
    @Override
    public void deleteByIds(String id) {
        this.removeById(id);
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


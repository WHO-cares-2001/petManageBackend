package com.example.demo.example.service.impl;

import com.example.demo.example.entity.Animal;
import com.example.demo.example.mapper.ShowAnimalMapper;
import com.example.demo.example.service.AnimalService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalServiceImpl extends ServiceImpl<ShowAnimalMapper, Animal> implements AnimalService {

    @Override
    public List<Animal> search(String name) {
        QueryWrapper<Animal> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("name",name);
        return this.list(queryWrapper);
    }
    @Override
    public Animal searchByName(String name) {
        QueryWrapper<Animal> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name",name);
        return this.getOne(queryWrapper);
    }
    @Override
    public List<Animal> searchByvideoId(String videoId) {
        QueryWrapper<Animal> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("video_id",videoId);
        return this.list(queryWrapper);
    }
    @Override
    public List<Animal> searchShop(String shopId) {
        QueryWrapper<Animal> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("shop_id",shopId);
        return this.list(queryWrapper);
    }
    @Override
    public List<Animal> searchBytypeId(String typeId) {
        QueryWrapper<Animal> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("type_id",typeId);
        return this.list(queryWrapper);
    }
    @Override
    public Animal searchById(String id) {
        QueryWrapper<Animal> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return this.getOne(queryWrapper);
    }
    @Override
    public Boolean add(Animal animal) {
        this.save(animal);
        return true;
    }
    @Override
    public Animal getByNames(String name) {
        QueryWrapper<Animal> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("name",name);
        return this.getOne(queryWrapper);
    }
    @Override
    public void deleteByIds(String id) {
        this.removeById(id);
    }
    @Override
    public void updata(Animal animal) {
        animal.setImg(animal.getImg());
        animal.setBirth(animal.getBirth());
        animal.setSex(animal.getSex());
        animal.setName(animal.getName());
        animal.setAge(animal.getAge());
        animal.setPrice(animal.getPrice());
        animal.setIntroduction(animal.getIntroduction());
        animal.setShopId(animal.getShopId());
        animal.setState(animal.getState());
        animal.setVideoId(animal.getVideoId());
        this.updateById(animal);
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


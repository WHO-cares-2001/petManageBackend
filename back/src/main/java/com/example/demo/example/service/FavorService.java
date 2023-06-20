package com.example.demo.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.example.entity.Favor;


public interface FavorService extends IService<Favor> {

    Boolean add(Favor favor);
    Favor getById(String userId,String stuffId);
    Favor getByIds(String userId,String animalId);
    void deleteByIds(String id);
    void dels(String ids);
}

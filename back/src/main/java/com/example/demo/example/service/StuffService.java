package com.example.demo.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.example.entity.Animal;
import com.example.demo.example.entity.Stuff;

import java.util.List;


public interface StuffService extends IService<Stuff> {
    List<Stuff> search(String name);
    Stuff searchById(String id);
    List<Stuff> searchShop(String shopId);
    Boolean add(Stuff stuff);
    Stuff getByNames(String name);
    void deleteByIds(String id);
    void updata(Stuff stuff);
    void dels(String ids);
}

package com.example.demo.example.service;

import com.example.demo.example.entity.Animal;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface AnimalService extends IService<Animal> {

    List<Animal> search(String name);
    Animal searchByName(String name);
    List<Animal> searchByvideoId(String videoId);
    List<Animal> searchShop(String shopId);
    List<Animal> searchBytypeId(String typeId);
    Animal searchById(String id);
    Boolean add(Animal animal);
    Animal getByNames(String name);
    void deleteByIds(String id);
    void updata(Animal animal);
    void dels(String ids);
}

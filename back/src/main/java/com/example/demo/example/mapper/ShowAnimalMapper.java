package com.example.demo.example.mapper;

import com.example.demo.example.entity.Animal;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ShowAnimalMapper extends BaseMapper<Animal> {
   @Select("SELECT animal.*, shop.shop_name, type.type_name, IF(animal.video_id is not null,(select video.video_name from video where animal.video_id = video.id),'null')as videoName FROM animal,shop,type " +
           "WHERE animal.shop_id = shop.id  AND animal.type_id=type.id")
    public List<Animal> getAllanimal();
    @Select("SELECT animal.* " +
            "FROM animal " +
            "WHERE  animal.video_id is null")
    public List<Animal> getAllanimals();
    @Select("SELECT animal.*, shop.shop_name, type.type_name, IF(animal.video_id is not null,(select video.video_name from video where animal.video_id = video.id),'null')as videoName FROM animal,shop,type " +
            "WHERE animal.shop_id = shop.id  AND animal.type_id=type.id AND animal.shop_id=#{id}")
    public List<Animal> getAllanimalbyshop(String id);
 @Select("SELECT animal.*, type.type_name,type.animal_type " +
         "FROM animal,type " +
         "WHERE animal.type_id=type.id AND type.animal_type=#{name}")
 public List<Animal> getAllanimalbytype(String name);
}

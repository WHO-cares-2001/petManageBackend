package com.example.demo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.example.entity.Type;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowTypeMapper extends BaseMapper<Type> {
    @Select("SELECT type.* from type")
    public List<Type> getAlltype();
    @Select("SELECT type.* from type where type.animal_type=#{name}")
    public List<Type> getAlltypebyanimal(String name);
}

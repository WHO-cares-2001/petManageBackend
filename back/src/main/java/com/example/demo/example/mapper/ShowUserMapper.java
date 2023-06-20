package com.example.demo.example.mapper;

import com.example.demo.example.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowUserMapper {
    @Select("select * from user "+
            "WHERE user.privilege!=2 ")
    public List<User> getAlluser();
}

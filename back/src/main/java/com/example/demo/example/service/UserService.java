package com.example.demo.example.service;

import com.example.demo.example.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;


public interface UserService extends IService<User> {
    User getByName(String username,String password);
    User getById(String id);
    Boolean add(User user);
    User getByNames(String username);
    User getByTel(String tel);
    void deleteByIds(String id);
    void updata(User user);
}
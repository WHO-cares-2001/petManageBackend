package com.example.demo.example.service.impl;

import com.example.demo.example.entity.Stuff;
import com.example.demo.example.entity.User;
import com.example.demo.example.mapper.UserMapper;
import com.example.demo.example.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Override
    public User getByName(String username,String password)
    {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("username",username);
        queryWrapper.eq("password",password);
        return this.getOne(queryWrapper);
    }
    @Override
    public User getById(String id)
    {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return this.getOne(queryWrapper);
    }
    @Override
    public Boolean add(User user) {
        this.save(user);
        return true;
    }
    @Override
    public User getByNames(String username) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("username",username);
        return this.getOne(queryWrapper);
    }
    @Override
    public User getByTel(String tel) {
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("tel",tel);
        return this.getOne(queryWrapper);
    }
    @Override
    public void deleteByIds(String id) {
        this.removeById(id);
    }
    @Override
    public void updata(User user) {
        user.setNikename(user.getNikename());
        user.setPassword(user.getPassword());
        user.setImg(user.getImg());
        user.setTel(user.getTel());
        user.setSex(user.getSex());
        user.setUsefull(user.getUsefull());
        this.updateById(user);
    }

}


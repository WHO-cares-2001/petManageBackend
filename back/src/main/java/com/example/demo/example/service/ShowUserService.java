package com.example.demo.example.service;
import com.example.demo.example.entity.User;
import com.example.demo.example.mapper.ShowUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowUserService {
    @Autowired
    ShowUserMapper showuserMapper;
    public List<User> getAlluser()
    {
        return showuserMapper.getAlluser();
    }
}

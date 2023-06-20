package com.example.demo.example.service;

import com.example.demo.example.entity.Favor;
import com.example.demo.example.mapper.FavorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowFavorService {
    @Autowired
    FavorMapper favorMapper;
    public List<Favor> getAllfavor(String id)
    {
        return favorMapper.getAllfavor(id);
    }
}

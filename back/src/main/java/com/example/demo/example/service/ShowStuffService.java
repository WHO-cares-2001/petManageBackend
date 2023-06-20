package com.example.demo.example.service;

import com.example.demo.example.entity.Stuff;
import com.example.demo.example.mapper.StuffMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowStuffService {
    @Autowired
    StuffMapper stuffMapper;
    public List<Stuff> getAllstuff()
    {
        return stuffMapper.getAllstuff();
    }
    public List<Stuff> getAllstuffByshopId(String id)
    {
        return stuffMapper.getAllstuffByshopId(id);
    }
}

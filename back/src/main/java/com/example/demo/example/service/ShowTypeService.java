package com.example.demo.example.service;

import com.example.demo.example.entity.Type;
import com.example.demo.example.mapper.ShowTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowTypeService {
    @Autowired
    ShowTypeMapper showtypeMapper;
    public List<Type> getAlltype(){ return showtypeMapper.getAlltype(); }
    public List<Type> getAlltypebyanimal(String name){ return showtypeMapper.getAlltypebyanimal(name); }
}

package com.example.demo.example.service;

import com.example.demo.example.entity.Animal;
import com.example.demo.example.mapper.ShowAnimalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowAnimalService {
    @Autowired
    ShowAnimalMapper showanimalMapper;
    public List<Animal> getAllanimal(){ return showanimalMapper.getAllanimal(); }
    public List<Animal> getAllanimals()
    {
        return showanimalMapper.getAllanimals();
    }
    public List<Animal> getAllanimalbyshop(String id){ return showanimalMapper.getAllanimalbyshop(id); }
    public List<Animal> getAllanimalbytype(String name){ return showanimalMapper.getAllanimalbytype(name); }
}

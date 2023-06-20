package com.example.demo.example.service.impl;

import com.example.demo.example.entity.Address;
import com.example.demo.example.mapper.AddressMapper;
import com.example.demo.example.service.AddressService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements AddressService {

    @Override
    public List<Address> searchByuserId(String userId) {
        QueryWrapper<Address> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_id",userId);
        return this.list(queryWrapper);
    }

    @Override
    public Boolean add(Address address) {
        this.save(address);
        return true;
    }
    @Override
    public Address getByNames(String name) {
        QueryWrapper<Address> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("address_name",name);
        return this.getOne(queryWrapper);
    }
    @Override
    public void updata(Address address) {
        address.setAddressName(address.getAddressName());
        address.setTel(address.getTel());
        address.setAdress(address.getAdress());
        address.setUsefull(address.getUsefull());
        address.setProvince(address.getProvince());
        address.setIsDefault(address.getIsDefault());
        this.updateById(address);
    }
    @Override
    public Address getByIds(String id) {
        QueryWrapper<Address> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return this.getOne(queryWrapper);
    }
}


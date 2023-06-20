package com.example.demo.example.service;

import com.example.demo.example.entity.Address;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;


public interface AddressService extends IService<Address> {


    List<Address> searchByuserId(String userId);
    Boolean add(Address address);
    Address getByNames(String name);
    void updata(Address address);
    Address getByIds(String id);
}

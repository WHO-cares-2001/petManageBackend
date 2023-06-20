package com.example.demo.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.example.entity.Favor;
import com.example.demo.example.entity.Message;


public interface MessageService extends IService<Message> {

    Boolean add(Message message);
    void deleteByIds(String id);
}

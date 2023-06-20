package com.example.demo.example.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.example.entity.Message;
import com.example.demo.example.mapper.MessageMapper;
import com.example.demo.example.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageServiceImpl extends ServiceImpl<MessageMapper, Message> implements MessageService {
    @Override
    public Boolean add(Message message) {
        this.save(message);
        return true;
    }
    @Override
    public void deleteByIds(String id) {
        this.removeById(id);
    }
}


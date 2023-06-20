package com.example.demo.example.service;

import com.example.demo.example.entity.Message;
import com.example.demo.example.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowMessageService {
    @Autowired
    MessageMapper showmessageMapper;
    public List<Message> getAllstuffmessage(String stuffId)
    {
        return showmessageMapper.getAllstuffmessage(stuffId);
    }
    public List<Message> getAllusermessage(String userId)
    {
        return showmessageMapper.getAllusermessage(userId);
    }
}

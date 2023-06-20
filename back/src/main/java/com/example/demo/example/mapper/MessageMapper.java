package com.example.demo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.example.entity.Message;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MessageMapper extends BaseMapper<Message> {
    @Select("select message.*,stuff.stuff_name,stuff.imgs,user.nikename,user.img " +
            "from message,stuff,user " +
            "where message.stuff_id=stuff.id and message.stuff_id=#{stuffId} and message.user_id=user.id")
    public List<Message> getAllstuffmessage(String stuffId);
    @Select("select message.*,stuff.stuff_name,stuff.imgs,user.nikename,user.img " +
            "from message,stuff,user " +
            "where message.stuff_id=stuff.id and message.user_id=#{userId} and message.user_id=user.id")
    public List<Message> getAllusermessage(String userId);
}

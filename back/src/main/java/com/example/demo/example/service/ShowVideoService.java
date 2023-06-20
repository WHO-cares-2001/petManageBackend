package com.example.demo.example.service;

import com.example.demo.example.entity.Video;
import com.example.demo.example.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowVideoService {
    @Autowired
    VideoMapper videoMapper;
    public List<Video> getAllvideo()
    {
        return videoMapper.getAllvideo();
    }
}

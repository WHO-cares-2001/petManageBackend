package com.example.demo.example.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.example.entity.Video;


public interface VideoService extends IService<Video> {
    Video searchs(String id);
    Video searchByName(String name);
    Boolean add(Video video);
    Video getByNames(String videoName);
    void deleteByIds(String id);
    void updata(Video video);
}
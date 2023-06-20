package com.example.demo.example.service.impl;

import com.example.demo.example.entity.Animal;
import com.example.demo.example.entity.Video;
import com.example.demo.example.mapper.VideoMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.example.service.VideoService;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper,Video> implements VideoService {
    @Override
    public Video searchs(String id) {
        QueryWrapper<Video> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return this.getOne(queryWrapper);
    }
    @Override
    public Video searchByName(String name) {
        QueryWrapper<Video> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("video_name",name);
        return this.getOne(queryWrapper);
    }
    @Override
    public Boolean add(Video video) {
        this.save(video);
        return true;
    }
    @Override
    public Video getByNames(String videoName) {
        QueryWrapper<Video> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("video_name",videoName);
        return this.getOne(queryWrapper);
    }
    @Override
    public void deleteByIds(String id) {
        this.removeById(id);
    }
    @Override
    public void updata(Video video) {
        video.setAnimalId(video.getAnimalId());
        this.updateById(video);
    }
}



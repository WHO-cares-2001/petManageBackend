package com.example.demo.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.example.entity.Video;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface VideoMapper extends BaseMapper<Video> {
    @Select("SELECT video.*, animal.name FROM video,animal " +
            "WHERE video.animal_id = animal.id")
    public List<Video> getAllvideo();
}

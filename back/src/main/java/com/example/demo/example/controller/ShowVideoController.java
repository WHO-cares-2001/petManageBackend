package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Video;
import com.example.demo.example.service.ShowVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class ShowVideoController {

    @Autowired
    private ShowVideoService showvideoservice;
    @GetMapping("/video")
    public Result show() {
        //return showvideoservice.getAllvideo();
        Result result = new Result();
        result.setData(showvideoservice.getAllvideo());
        return result;
    }
}


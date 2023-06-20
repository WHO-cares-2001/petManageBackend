package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.User;
import com.example.demo.example.service.ShowUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class ShowUserController {

    @Autowired
    private ShowUserService showuserService;
    @GetMapping("/user")
    public Result show() {
        //return showuserService.getAlluser();
        Result result = new Result();
        result.setData(showuserService.getAlluser());
        return result;
    }
}



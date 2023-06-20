package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Stuff;
import com.example.demo.example.service.ShowStuffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class ShowStuffController {
    @Autowired
    private ShowStuffService showstuffService;
    @GetMapping("/stuff")
    public Result show() {
        //return showstuffService.getAllstuff();
        Result result = new Result();
        result.setData(showstuffService.getAllstuff());
        return result;
    }
    @GetMapping("/stuffbyshopid")
    public Result shows(String id) {
        //return showstuffService.getAllstuffByshopId(id);
        Result result = new Result();
        result.setData(showstuffService.getAllstuffByshopId(id));
        return result;
    }
}

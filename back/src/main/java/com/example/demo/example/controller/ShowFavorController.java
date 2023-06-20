package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Favor;
import com.example.demo.example.service.ShowFavorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class ShowFavorController {
    @Autowired
    private ShowFavorService showfavorService;
    @GetMapping("/favor")
    public Result show(String id) {

        //return showfavorService.getAllfavor(id);
        Result result = new Result();
        result.setData(showfavorService.getAllfavor(id));
        return result;
    }
}

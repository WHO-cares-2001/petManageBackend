package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Cart;
import com.example.demo.example.service.ShowCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class ShowCartController {
    @Autowired
    private ShowCartService showcartService;
    @GetMapping("/cart")
    public Result show(String id) {

        //return showcartService.getAllcart(id);
        Result result = new Result();
        result.setData(showcartService.getAllcart(id));
        return result;
    }
}

package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Animal;
import com.example.demo.example.entity.Orders;
import com.example.demo.example.service.ShowAnimalService;
import com.example.demo.example.service.ShowOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class ShowOrdersController {
    @Autowired
    private ShowOrdersService showOrdersService;
    @GetMapping("/orders")
    public Result show(String id) {
        //return showOrdersService.getAllorders(id);
        Result result = new Result();
        result.setData(showOrdersService.getAllorders(id));
        return result;
    }
    @GetMapping("/bystateorders")
    public Result shows(String id,Integer state) {
        //return showOrdersService.getAllByStateOrders(id,state);
        Result result = new Result();
        result.setData(showOrdersService.getAllByStateOrders(id,state));
        return result;
    }
}

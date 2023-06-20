package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Shop;
import com.example.demo.example.service.ShowShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class ShowShopController {

    @Autowired
    private ShowShopService showshopService;
    @GetMapping("/shop")
    public Result show() {
        //return showshopService.getAllshop();
        Result result = new Result();
        result.setData(showshopService.getAllshop());
        return result;
    }
    @GetMapping("/shops")
    public Result shows(String address) {
        //return showshopService.getAllshops(address);
        Result result = new Result();
        result.setData(showshopService.getAllshops(address));
        return result;
    }
}
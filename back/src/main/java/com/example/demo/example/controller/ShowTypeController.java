package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Type;
import com.example.demo.example.service.ShowTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class ShowTypeController {
    @Autowired
    private ShowTypeService showtypeService;
    @GetMapping("/type")
    public Result show() {
       // return showtypeService.getAlltype();
        Result result = new Result();
        result.setData(showtypeService.getAlltype());
        return result;
    }
    @GetMapping("/typebyanimal")
    public Result shows(String name) {
      //  return showtypeService.getAlltypebyanimal(name);
        Result result = new Result();
        result.setData(showtypeService.getAlltypebyanimal(name));
        return result;
    }
}

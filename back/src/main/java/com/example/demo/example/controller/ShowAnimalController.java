package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Animal;
import com.example.demo.example.service.ShowAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class ShowAnimalController {
    @Autowired
    private ShowAnimalService showanimalService;
    @GetMapping("/animal")
    public Result show() {
       // return showanimalService.getAllanimal();
        Result result = new Result();
        result.setData(showanimalService.getAllanimal());
        return result;
    }
    @GetMapping("/animals")
    public Result shows() {
       // return showanimalService.getAllanimals();
        Result result = new Result();
        result.setData(showanimalService.getAllanimals());
        return result;
    }
    @GetMapping("/animalbyshopid")
    public Result showss(String id) {
       // return showanimalService.getAllanimalbyshop(id);
        Result result = new Result();
        result.setData(showanimalService.getAllanimalbyshop(id));
        return result;
    }
    @GetMapping("/animalbytype")
    public Result showsss(String name) {
       // return showanimalService.getAllanimalbytype(name);
        Result result = new Result();
        result.setData(showanimalService.getAllanimalbytype(name));
        return result;
    }
}

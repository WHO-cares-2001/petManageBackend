package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.service.ShowMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/show")
public class ShowMessageController {
    @Autowired
    private ShowMessageService showmessageService;
    @GetMapping("/stuffmessage")
    public Result show(String stuffId) {
        //return showmessageService.getAllstuffmessage(stuffId);
        Result result = new Result();
        result.setData(showmessageService.getAllstuffmessage(stuffId));
        return result;
    }
    @GetMapping("/usermessage")
    public Result shows(String userId) {

        //return showmessageService.getAllusermessage(userId);
        Result result = new Result();
        result.setData(showmessageService.getAllusermessage(userId));
        return result;
    }
}

package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Message;
import com.example.demo.example.service.MessageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;
    //增加
    @ApiOperation(value="添加记录")
    @RequestMapping(method = RequestMethod.POST,value = "/saves")
    public Result save(@RequestBody Message message){
        Result result = new Result();
        messageService.add(message);
        return result;
    }
    //删-deleteByIds
    @ApiOperation(value="删除记录")
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    public Result deleteByIds(String id){
        Result result = new Result();
        messageService.deleteByIds(id);
        result.success("删除成功");
        return result;
    }
}

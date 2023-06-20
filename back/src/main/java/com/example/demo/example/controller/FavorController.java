package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Cart;
import com.example.demo.example.entity.Favor;
import com.example.demo.example.service.FavorService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/favor")
public class FavorController {

    @Autowired
    private FavorService favorService;
    //增加
    @ApiOperation(value="添加记录")
    @RequestMapping(method = RequestMethod.POST,value = "/saves")
    public Result save(@RequestBody Favor favor){
        Result result = new Result();
        Favor favorExit=favorService.getById(favor.getId(),favor.getStuffId());
        Favor favorsExit=favorService.getByIds(favor.getId(),favor.getAnimalId());
        if(favorExit!=null||favorsExit!=null)
        {
            result.fail("添加失败");
        }else
        {
            favorService.add(favor);
        }
        return result;
    }
    //删-deleteByIds
    @ApiOperation(value="删除记录")
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    public Result deleteByIds(String id){
        Result result = new Result();
        favorService.deleteByIds(id);
        result.success("删除成功");
        return result;
    }
    @ApiOperation(value="批量删除")
    @RequestMapping(method = RequestMethod.POST,value = "/deletes")
    public Result dels( String ids){
        Result result = new Result();
        favorService.dels(ids);
        result.success("删除成功");
        return result;
    }
}

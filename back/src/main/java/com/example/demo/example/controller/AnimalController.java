package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Animal;
import com.example.demo.example.service.AnimalService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @ApiOperation(value="搜索animal记录")
    @RequestMapping(method = RequestMethod.POST,value = "/search")
    public Result search(String name){
        Result result = new Result();
        result.setData(animalService.search(name));
        return result;
    }
    @ApiOperation(value="通过名称查询animal记录（和名称一样）")
    @RequestMapping(method = RequestMethod.POST,value = "/searchname")
    public Result searchByName(String name){
        Result result = new Result();
        result.setData(animalService.searchByName(name));
        return result;
    }
    @ApiOperation(value="根据videoId查询animal记录")
    @RequestMapping(method = RequestMethod.POST,value = "/searchs")
    public Result searchByvideoId(String videoId){
        Result result = new Result();
        result.setData(animalService.searchByvideoId(videoId));
        return result;
    }
    @ApiOperation(value="根据shopId查询该商店里的所有animal记录")
    @RequestMapping(method = RequestMethod.POST,value = "/searches")
    public Result searchShop(String shopId){
        Result result = new Result();
        result.setData(animalService.searchShop(shopId));
        return result;
    }
    @ApiOperation(value="根据typeId查询animal记录")
    @RequestMapping(method = RequestMethod.POST,value = "/searchbytype")
    public Result searchBytypeId(String typeId){
        Result result = new Result();
        result.setData(animalService.searchBytypeId(typeId));
        return result;
    }
    @ApiOperation(value="根据Id查询animal记录")
    @RequestMapping(method = RequestMethod.POST,value = "/searchbyid")
    public Result searchById(String id){
        Result result = new Result();
        result.setData(animalService.searchById(id));
        return result;
    }
    //增加
    @ApiOperation(value="添加记录")
    @RequestMapping(method = RequestMethod.POST,value = "/saves")
    public Result save(@RequestBody Animal animal){
        Result result = new Result();
        Animal animalExit=animalService.getByNames(animal.getName());
        if(animalExit!=null)
        {
            result.fail("商品："+animal.getName()+"，已经存在，不能新增");
        }else
        {
            animalService.add(animal);
        }
        return result;
    }
    //删-deleteByIds
    @ApiOperation(value="删除记录")
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    public Result deleteByIds(String id){
        Result result = new Result();
        animalService.deleteByIds(id);
        result.success("删除成功");
        return result;
    }
    //修改
    @ApiOperation(value="修改记录")
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updatas")
    public Result updata(@RequestBody Animal animal){
        Result result = new Result();
        animalService.updata(animal);
        return result;
    }

    @ApiOperation(value="删除商店下的所有animal记录")
    @RequestMapping(method = RequestMethod.POST,value = "/deleteShopByIds")
    public Result deles( String ids){
        Result result = new Result();
        animalService.dels(ids);
        result.success("修改成功");
        return result;
    }
}

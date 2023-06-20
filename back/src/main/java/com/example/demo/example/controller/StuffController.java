package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Stuff;
import com.example.demo.example.service.StuffService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/stuff")
public class StuffController {

    @Autowired
    private StuffService stuffService;

    @ApiOperation(value="搜索stuff记录")
    @RequestMapping(method = RequestMethod.POST,value = "/search")
    public Result search(String name){
        Result result = new Result();
        result.setData(stuffService.search(name));
        return result;
    }

    @ApiOperation(value="根据Id查询animal记录")
    @RequestMapping(method = RequestMethod.POST,value = "/searchbyid")
    public Result searchById(String id){
        Result result = new Result();
        result.setData(stuffService.searchById(id));
        return result;
    }
    @ApiOperation(value="根据shopId查询该商店里的所有stuff记录")
    @RequestMapping(method = RequestMethod.POST,value = "/searches")
    public Result searchShop(String shopId){
        Result result = new Result();
        result.setData(stuffService.searchShop(shopId));
        return result;
    }


    //增加
    @ApiOperation(value="添加记录")
    @RequestMapping(method = RequestMethod.POST,value = "/saves")
    public Result save(@RequestBody Stuff stuff){
        Result result = new Result();
        Stuff stuffExit=stuffService.getByNames(stuff.getStuffName());
        if(stuffExit!=null)
        {
            result.fail("商品："+stuff.getStuffName()+"，已经存在，不能新增");
        }else
        {
            stuff.setImgs("img/"+stuff.getImgs());
            stuffService.add(stuff);
        }
        return result;
    }
    //删-deleteByIds
    @ApiOperation(value="删除记录")
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    public Result deleteByIds(String id){
        Result result = new Result();
        stuffService.deleteByIds(id);
        result.success("删除成功");
        return result;
    }
    //修改
    @ApiOperation(value="修改记录")
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updatas")
    public Result updata(@RequestBody Stuff stuff){
        Result result = new Result();
        stuffService.updata(stuff);
        return result;
    }

    @ApiOperation(value="删除商店下的所有stuff记录")
    @RequestMapping(method = RequestMethod.POST,value = "/deleteShopByIds")
    public Result deles( String ids){
        Result result = new Result();
        stuffService.dels(ids);
        result.success("删除成功");
        return result;
    }
}

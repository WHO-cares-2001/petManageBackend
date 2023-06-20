package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Shop;
import com.example.demo.example.service.ShopService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;

    @ApiOperation(value="根据名称查询shop记录")
    @RequestMapping(method = RequestMethod.POST,value = "/search")
    public Result search(String shopName){
        Result result = new Result();
        result.setData(shopService.search(shopName));
        return result;
    }
    @ApiOperation(value="根据id查询shop记录")
    @RequestMapping(method = RequestMethod.POST,value = "/searchs")
    public Result searchs(String id){
        Result result = new Result();
        result.setData(shopService.searchs(id));
        return result;
    }
    //增加
    @ApiOperation(value="添加记录")
    @RequestMapping(method = RequestMethod.POST,value = "/saves")
    public Result save(@RequestBody Shop shop){
        Result result = new Result();
        Shop shopExit=shopService.getByNames(shop.getShopName());
        if(shopExit!=null)
        {
            result.fail("商店："+shop.getShopName()+"，已经存在，不能新增");
        }else
        {
            shop.setImg("img/"+shop.getImg());
            shopService.add(shop);
        }
        return result;
    }
    //删-deleteByIds
    @ApiOperation(value="删除记录")
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    public Result deleteByIds(String id){
        Result result = new Result();
        shopService.deleteByIds(id);
        result.success("删除成功");
        return result;
    }
    //修改
    @ApiOperation(value="修改记录")
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updatas")
    public Result updata(@RequestBody Shop shop){
        Result result = new Result();
        shopService.updata(shop);
        return result;
    }
}

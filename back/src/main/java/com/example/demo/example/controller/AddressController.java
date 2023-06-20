package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Address;
import com.example.demo.example.service.AddressService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @ApiOperation(value="根据userId查询address记录")
    @RequestMapping(method = RequestMethod.POST,value = "/searchs")
    public Result searchByuserId(String userId){
        Result result = new Result();
        result.setData(addressService.searchByuserId(userId));
        return result;
    }
    //增加
    @ApiOperation(value="添加记录")
    @RequestMapping(method = RequestMethod.POST,value = "/saves")
    public Result save(@RequestBody Address address){
        Result result = new Result();
        Address addressExit=addressService.getByNames(address.getUserId());
        if(addressExit!=null)
        {
            result.fail("商品："+address.getAddressName()+"，已经存在，不能新增");
        }else
        {
            addressService.add(address);
        }
        return result;
    }
    //修改
    @ApiOperation(value="修改记录")
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updatas")
    public Result updata(@RequestBody Address address){
        Result result = new Result();
        addressService.updata(address);
        return result;
    }
    //修改
    @ApiOperation(value="修改记录")
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updatass")
    public Result updatas(String id){
        Result result = new Result();
        Address addressExit=addressService.getByIds(id);
        addressExit.setId(id);
        addressExit.setUsefull(0);
        addressService.updata(addressExit);
        return result;
    }

}

package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Animal;
import com.example.demo.example.entity.Cart;
import com.example.demo.example.service.CartService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;
    //修改
    @ApiOperation(value="修改记录")
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updatas")
    public Result updata(@RequestBody Cart cart){
        Result result = new Result();
        cartService.updata(cart);
        return result;
    }
    //增加
    @ApiOperation(value="添加记录")
    @RequestMapping(method = RequestMethod.POST,value = "/saves")
    public Result save(@RequestBody Cart cart){
        Result result = new Result();
        Cart cartExit=cartService.getById(cart.getUserId(),cart.getStuffId());
        Cart cartsExit=cartService.getByIds(cart.getUserId(),cart.getAnimalId());
        if(cartExit!=null||cartsExit!=null)
        {
            if(cart.getGoodsType()==0)
                cartService.addupdata(cartsExit.getId());
            else
                cartService.addupdata(cartExit.getId());
        }else
        {
           // cart.setNumber(1);
            cartService.add(cart);
        }
        return result;
    }
    //删-deleteByIds
    @ApiOperation(value="删除记录")
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    public Result deleteByIds(String id){
        Result result = new Result();
        cartService.deleteByIds(id);
        result.success("删除成功");
        return result;
    }
    //修改
    @ApiOperation(value="增加")
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/addupdatas")
    public Result addupdata(String id){
        Result result = new Result();
        cartService.addupdata(id);
        return result;
    }
    //修改
    @ApiOperation(value="减少")
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/jianupdatas")
    public Result jianupdata(String id){
        Result result = new Result();
        cartService.jianupdata(id);
        return result;
    }
    @ApiOperation(value="批量删除")
    @RequestMapping(method = RequestMethod.POST,value = "/deletes")
    public Result dels( String ids){
        Result result = new Result();
        cartService.dels(ids);
        result.success("删除成功");
        return result;
    }
}

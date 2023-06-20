package com.example.demo.example.controller;

import com.example.demo.common.utils.JwtUtil;
import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Stuff;
import com.example.demo.example.entity.User;
import com.example.demo.example.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping(method = RequestMethod.POST,value = "/login")
    public Result login(@RequestBody User users) {
        Result result = new Result();
        User user= userService.getByName(users.getUsername(),users.getPassword());
        if(user!=null)
        {
            Map<String,Object> map=new HashMap<>();
            map.put("user",user);
            map.put("token", JwtUtil.generateToken(user.getId()));
            result.success("登录成功");
            result.setData(map);
        }else{
            result.fail("没有该用户");
        }
        return result;
    }
    @ApiOperation(value="根据Id查询user记录")
    @RequestMapping(method = RequestMethod.POST,value = "/searchbyid")
    public Result searchById(String id){
        Result result = new Result();
        result.setData(userService.getById(id));
        return result;
    }
    //增加
    @ApiOperation(value="添加记录")
    @RequestMapping(method = RequestMethod.POST,value = "/saves")
    public Result save(@RequestBody User user){
        Result result = new Result();
        User userExit=userService.getByNames(user.getUsername());
        User usersExit=userService.getByTel(user.getTel());
        if(userExit!=null||usersExit!=null)
        {
            result.fail("用户："+user.getUsername()+"，已经存在，不能新增");
        }else
        {
            if(user.getPrivilege()==null)
                user.setPrivilege(1);
            user.setUsefull(1);
            user.setImg("img/"+user.getImg());
            userService.add(user);
        }
        return result;
    }
    //删-deleteByIds
    @ApiOperation(value="删除记录")
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    public Result deleteByIds(String id){
        Result result = new Result();
        userService.deleteByIds(id);
        result.success("删除成功");
        return result;
    }
    //修改
    @ApiOperation(value="修改记录")
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updatas")
    public Result updata(@RequestBody User user){
        Result result = new Result();
        userService.updata(user);
        return result;
    }

}

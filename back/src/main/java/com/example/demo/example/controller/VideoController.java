package com.example.demo.example.controller;

import com.example.demo.common.utils.Result;
import com.example.demo.example.entity.Video;
import com.example.demo.example.service.VideoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping("/video")
public class VideoController {

    @Autowired
    private VideoService videoService;
    @ApiOperation(value="根据id查询video记录")
    @RequestMapping(method = RequestMethod.POST,value = "/searchs")
    public Result searchs(String id){
        Result result = new Result();
        result.setData(videoService.searchs(id));
        return result;
    }
    @ApiOperation(value="通过名称查询video记录（和名称一样）")
    @RequestMapping(method = RequestMethod.POST,value = "/searchname")
    public Result searchByName(String name){
        Result result = new Result();
        result.setData(videoService.searchByName(name));
        return result;
    }
    //增加
    @ApiOperation(value="添加记录")
    @RequestMapping(method = RequestMethod.POST,value = "/saves")
    public Result save(@RequestBody Video video){
        Result result = new Result();
        Video videoExit=videoService.getByNames("video/"+video.getVideoName());
        if(videoExit!=null)
        {
            result.fail("视频："+video.getVideoName()+"，已经存在，不能新增");
        }else
        {
            video.setVideoName("video/"+video.getVideoName());
            videoService.add(video);
        }
        return result;
    }
    //删-deleteByIds
    @ApiOperation(value="删除记录")
    @RequestMapping(method = RequestMethod.POST,value = "/delete")
    public Result deleteByIds(String id){
        Result result = new Result();
        videoService.deleteByIds(id);
        result.success("删除成功");
        return result;
    }
    //修改
    @ApiOperation(value="修改记录")
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST,value = "/updatas")
    public Result updata(@RequestBody Video video){
        Result result = new Result();
        videoService.updata(video);
        return result;
    }
}

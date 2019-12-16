package com.zeng.generator.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.zeng.common.BaseController;
import com.zeng.generator.service.IUserService;
import com.zeng.generator.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * <p>
    *  前端控制器
    * </p>
 *
 * @author zengzhanliang
 * @since 2019-12-16
 */
@RestController
@RequestMapping("/user")
@Api(tags = "user 表相关接口", description = "提供 user 表相关的 Rest API")
public class UserController extends BaseController<IUserService,User> {

    @Override
    @ApiOperation(value="获取 user 详细信息", notes="根据url的 id 来获取 user 详细信息")
    @ApiImplicitParam(name = "id", value = "唯一编码", dataType = "long", paramType="query", defaultValue = "10000015")
    @RequestMapping(value="/getById", method=RequestMethod.GET)
    public Object getById(long id) {
        return super.getById(id);
    }


    @Override
    @ApiOperation(value="分页获取 user 详细信息", notes="根据url的 pageNum, pageSize 来获取 user 详细信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageNum", value = "页码", dataType = "int", paramType="query", defaultValue = "1"),
            @ApiImplicitParam(name = "pageSize", value = "每页数量", dataType = "int", paramType="query", defaultValue = "8")
    })
    @RequestMapping(value="/getPage", method=RequestMethod.GET)
    public Object getPage(int pageNum, int pageSize) {
        return super.getPage(pageNum, pageSize);
    }


    @Override
    @ApiOperation(value="创建 user ", notes="根据 user 对象创建实体")
    @RequestMapping(value="/create", method=RequestMethod.POST)
    public Object create(@RequestBody User user) {
        return super.create(user);
    }


    @Override
    @ApiOperation(value="修改 user ", notes="根据 user 对象修改实体")
    @RequestMapping(value="/update", method=RequestMethod.POST)
    public Object update(@RequestBody User user) {
        return super.update(user);
    }


    @Override
    @ApiOperation(value="删除 user ", notes="根据url的 id 来删除 user ")
    @ApiImplicitParam(name = "id", value = "唯一编码", dataType = "long", paramType="query", defaultValue = "10000015")
    @RequestMapping(value="/removeById", method=RequestMethod.GET)
    public Object removeById(long id) {
        return super.removeById(id);
    }

}

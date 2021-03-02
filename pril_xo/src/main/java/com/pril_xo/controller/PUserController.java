package com.pril_xo.controller;

import com.pril_common.utils.ResultBean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import io.swagger.annotations.Api;
import io.swagger.annotations.*;
import java.util.*;
import  com.pril_xo.service.PUserService;
import  com.pril_xo.entity.PUser;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author czh
 * @date 2020-12-24
 */
@RestController
@CrossOrigin
@Api(value = "pUserCRUD接口")
@RequestMapping("/pril_xo/pUser")
public class PUserController {

    @Autowired
    private PUserService pUserService;

    @ApiOperation(value = "获取pUser根据id",notes="")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String")
    @GetMapping("/getById")
    public ResultBean pUser(@RequestParam(value = "id") String id) throws Exception {

        PUser pUser = pUserService.getPUserById(id);
        ResultBean resultBean = new ResultBean();
        resultBean.fillData(pUser);
        return resultBean;
    }

    @ApiOperation(value = "获取pUser列表",notes="")
    @ApiImplicitParam(name = "map", value = "pUser实体中的参数", dataType ="Map")
    @GetMapping("/getUserList")
    public ResultBean pUserList(@RequestParam(required = false) Map<String, Object> map) throws Exception {

        List<PUser> pUserList = pUserService.listPUser(map);
        ResultBean resultBean = new ResultBean();
        resultBean.fillData(pUserList);
        return resultBean;
    }

    @ApiOperation(value = "分页获取pUser列表",notes="")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "map", value = "pUser实体中的参数", dataType="Map"),
        @ApiImplicitParam(name = "pageNo", value = "当前页", dataType = "String"),
        @ApiImplicitParam(name = "pageSize", value = "每页数据条数", dataType = "String"),
    })
    @GetMapping("/page")
    public ResultBean pUserPage(@RequestParam(required = false) Map<String, Object> map,
                                        @RequestParam(name = "pageNo", required = false, defaultValue = "1") Integer pageNo,
                                        @RequestParam(name = "pageSize", required = false, defaultValue = "10") Integer pageSize) throws Exception {

        List<PUser> pUserList = pUserService.pagePUser(map, pageNo, pageSize);
        ResultBean resultBean = new ResultBean();
        resultBean.fillData(pUserList);
        return resultBean;
    }

    @ApiOperation(value = "添加pUser",notes="新增一条pUser")
    @ApiImplicitParam(name = "pUser", value = "pUser实体中的参数", required = true, dataType = "PUser")
    @PostMapping("")
    public ResultBean pUserAdd(@RequestBody PUser pUser) throws Exception {

        Integer flag = pUserService.addPUser(pUser);
        ResultBean resultBean = new ResultBean();
        resultBean.fillData(flag);
        return resultBean;
    }

    @ApiOperation(value = "修改pUser",notes="根据id修改p_user")
    @ApiImplicitParam(name = "pUser", value = "pUser实体", required = true, dataType = "PUser")
    @PutMapping("")
    public ResultBean pUserUpdate(@RequestBody PUser pUser) throws Exception {

        Integer flag = pUserService.updatePUser(pUser);
        ResultBean resultBean = new ResultBean();
        resultBean.fillData(flag);
        return resultBean;
    }
    @ApiOperation(value = "物理删除pUser",notes="根据id物理删除pUser")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String")
    @DeleteMapping("/{id}")
    public ResultBean pUserDelete(@PathVariable(name = "id") String id) throws Exception {

        Integer flag = pUserService.deletePUserById(id);
        ResultBean resultBean = new ResultBean();
        resultBean.fillData(flag);
        return resultBean;
    }

    @ApiOperation(value = "逻辑删除pUser",notes="根据id逻辑删除pUser")
    @ApiImplicitParam(name = "id", value = "id", required = true, dataType = "String")
    @PostMapping("/removeById")
    public ResultBean pUserRemove(@RequestParam(value = "id") String id) throws Exception {

        Integer flag = pUserService.removePUserById(id);
        ResultBean resultBean = new ResultBean();
        resultBean.fillData(flag);
        return resultBean;
    }
}

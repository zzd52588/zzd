package com.csqf.business.admin.controller;

import com.csqf.business.customer.feign.FeginCustomerService;
import com.csqf.dto.ResponseResult;
import com.csqf.provider.admin.entity.Admin;
import com.csqf.provider.admin.service.IAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@Api("管理员控制接口")
@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private FeginCustomerService feginCustomerService;

    @Reference(version = "1.0.2")
    private IAdminService adminService;

    @ApiOperation("增加管理员")
    @GetMapping("/addAdmin")
    public ResponseResult addAdmin(String adPwd,String adAccount,String adName){
        Admin admin  =new Admin();
        admin.setAdAccount(adAccount);
        admin.setAdPwd(adPwd);
        admin.setAdName(adName);
        boolean save = adminService.save(admin);
        ResponseResult resp = new ResponseResult();
        resp.setData(save);
        return resp;
    }
    @ApiOperation("调用用户的方法--添加一个用户")
    @GetMapping("/UseAddUser")
    public ResponseResult UseAddUser(String uAccount, String uPwd, String uName,String uTelnum,String uSex){
        ResponseResult resp = feginCustomerService.addUser(uAccount, uPwd, uName, uTelnum, uSex);
        return resp;
    }
    @ApiOperation("查询管理员")
    @GetMapping("/selAdmin/{adId}")
    public ResponseResult selAdmin(@PathVariable int adId){
        Admin admin = adminService.getById(adId);
        ResponseResult resp = new ResponseResult();
        resp.setData(admin);
        return resp;
    }
}

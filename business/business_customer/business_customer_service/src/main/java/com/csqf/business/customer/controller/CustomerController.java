package com.csqf.business.customer.controller;

import com.csqf.business.admin.feign.FeginAdminService;
import com.csqf.dto.ResponseResult;
import com.csqf.provider.customer.entity.User;
import com.csqf.provider.customer.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@Api("管理员控制接口")
@RestController
@RequestMapping("/customer")
public class CustomerController {

    /*@Autowired
    private FeginAdminService feginAdminService;*/

   @Reference(version = "1.0.2")
    private IUserService userService;

    @ApiOperation("增加用户")
    @GetMapping("/addUser")
    public ResponseResult addUser(String uAccount, String uPwd, String uName,String uTelnum,String uSex){
        ResponseResult resp = new ResponseResult();
        User  user  =new User();
        user.setuAccount(uAccount);
        user.setuPwd(uPwd);
        user.setuName(uName);
        user.setuSex(uSex);
        user.setuTelnum(uTelnum);
        boolean save = userService.save(user);
        resp.setData(save);
        return resp;
    }

   /* @ApiOperation("通过feign查询管理员")
    @GetMapping("/UserselAdmin/{adId}")
    public ResponseResult UserselAdmin(@PathVariable int adId){
        ResponseResult resp = feginAdminService.selAdmin(adId);
        return  resp;
    }*/
}

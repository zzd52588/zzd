package com.csqf.business.customer.feign;

import com.csqf.dto.ResponseResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient(value = "supermarket-customer")
public interface FeginCustomerService {

    @ApiOperation("增加用户")
    @GetMapping("/customer/addUser")
    ResponseResult addUser(@RequestParam String uAccount,@RequestParam  String uPwd,@RequestParam String uName,@RequestParam  String uTelnum, @RequestParam String uSex);
}

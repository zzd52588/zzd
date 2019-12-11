package com.csqf.business.admin.feign;

import com.csqf.dto.ResponseResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "supermarket-admin",fallback = FeginAdminServiceFallback.class)
public interface FeginAdminService {

    @ApiOperation("增加管理员")
    @GetMapping("/admin/addAdmin")
     ResponseResult addAdmin(String adPwd, String adAccount, String adName);

    @ApiOperation("查询管理员")
    @GetMapping("/admin/selAdmin/{adId}")
     ResponseResult selAdmin(@PathVariable int adId);
}

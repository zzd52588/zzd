package com.csqf.business.admin.feign;

import com.csqf.dto.ResponseResult;
import org.springframework.stereotype.Component;

@Component
public class FeginAdminServiceFallback implements FeginAdminService {

    @Override
    public ResponseResult addAdmin(String adPwd, String adAccount, String adName) {
        ResponseResult  resp  =new ResponseResult();
        resp.setData("sentinel addAdmin error");
        return resp;
    }

    @Override
    public ResponseResult selAdmin(int adId) {
        ResponseResult  resp  =new ResponseResult();
        resp.setData("sentinel selAdmin error");
        return resp;
    }
}

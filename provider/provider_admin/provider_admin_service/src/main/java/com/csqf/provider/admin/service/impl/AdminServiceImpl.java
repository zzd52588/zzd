package com.csqf.provider.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csqf.provider.admin.entity.Admin;
import com.csqf.provider.admin.mapper.AdminMapper;
import com.csqf.provider.admin.service.IAdminService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jerry
 * @since 2019-11-16
 */
@Service
@org.apache.dubbo.config.annotation.Service(version = "1.0.2")
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}

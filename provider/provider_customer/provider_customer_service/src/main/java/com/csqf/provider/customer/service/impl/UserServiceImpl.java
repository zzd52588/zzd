package com.csqf.provider.customer.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csqf.provider.customer.entity.User;
import com.csqf.provider.customer.mapper.UserMapper;
import com.csqf.provider.customer.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public User getUser(int uId) {
        User user = getById(uId);
        return user;
    }
}

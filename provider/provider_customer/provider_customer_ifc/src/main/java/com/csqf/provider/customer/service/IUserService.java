package com.csqf.provider.customer.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.csqf.provider.customer.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jerry
 * @since 2019-11-16
 */
public interface IUserService extends IService<User> {
    /**
     * 根据用户id得到用户对象
     * @param uId
     * @return
     */
    User getUser(int uId);
}

package com.dity.mybatisplus.service.impl;

import com.dity.mybatisplus.entity.User;
import com.dity.mybatisplus.mapper.UserMapper;
import com.dity.mybatisplus.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yuhang
 * @since 2018-08-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

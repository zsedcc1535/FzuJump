package com.ambition.service.impl;

import com.ambition.pojo.User;
import com.ambition.mapper.UserMapper;
import com.ambition.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Ambition
 * @since 2022-11-12
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}

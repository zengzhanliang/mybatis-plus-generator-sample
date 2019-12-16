package com.zeng.generator.service.impl;

import com.zeng.generator.entity.User;
import com.zeng.generator.mapper.UserMapper;
import com.zeng.generator.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zengzhanliang
 * @since 2019-12-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

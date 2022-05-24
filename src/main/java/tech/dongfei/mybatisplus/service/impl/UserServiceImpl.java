package tech.dongfei.mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tech.dongfei.mybatisplus.mapper.UserMapper;
import tech.dongfei.mybatisplus.pojo.User;
import tech.dongfei.mybatisplus.service.UserService;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

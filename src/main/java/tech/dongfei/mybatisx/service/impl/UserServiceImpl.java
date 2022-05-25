package tech.dongfei.mybatisx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import tech.dongfei.mybatisx.pojo.User;
import tech.dongfei.mybatisx.service.UserService;
import tech.dongfei.mybatisx.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author dongfei
* @description 针对表【t_user】的数据库操作Service实现
* @createDate 2022-05-25 15:42:07
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}





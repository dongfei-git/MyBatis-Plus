package tech.dongfei.mybatisx.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import tech.dongfei.mybatisx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author dongfei
* @description 针对表【t_user】的数据库操作Mapper
* @createDate 2022-05-25 15:42:07
* @Entity tech.dongfei.mybatisx.pojo.User
*/
public interface UserMapper extends BaseMapper<User> {

    int insertSelective(User user);

    int deleteByUidAndUserName(@Param("uid") Long uid, @Param("userName") String userName);

    int updateAgeAndSexByUid(@Param("age") Integer age, @Param("sex") Integer sex, @Param("uid") Long uid);

    List<User> selectAgeAndSexAndUserName();

}





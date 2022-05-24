package tech.dongfei.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.dongfei.mybatisplus.mapper.UserMapper;
import tech.dongfei.mybatisplus.pojo.User;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class MyBatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectList(){
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }

    @Test
    public void testInsert(){
        User user = new User();
        user.setName("张三");
        user.setAge(19);
        user.setEmail("zhangsan@qq.com");
        int result = userMapper.insert(user);
        System.out.println("result:"+result);
        System.out.println("id:"+user.getId());
    }

    @Test
    public void testDelete(){
//        int result = userMapper.deleteById(1528603071584788482L);
//        System.out.println("result:"+result);

//        Map<String,Object> map = new HashMap<>();
//        map.put("name","张三");
//        map.put("age",19);
//        int result = userMapper.deleteByMap(map);  //DELETE FROM user WHERE name = ? AND age = ?
//        System.out.println("result:"+result);

        List<Long> idList = Arrays.asList(1528613342852210689L, 1528613445868470273L);
        int result = userMapper.deleteBatchIds(idList);  //DELETE FROM user WHERE id IN ( ? , ? )
        System.out.println("result:"+result);
    }

    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1L);
        user.setName("Jone");
        user.setEmail("test1@baomidou.com");
        user.setAge(20);
        int result = userMapper.updateById(user);
        System.out.println("result:"+result);
    }

    @Test
    public void testSelect(){
//        User user = userMapper.selectById(1L);  //SELECT id,name,age,email FROM user WHERE id=?
//        System.out.println(user);

//        List<User> users = userMapper.selectBatchIds(Arrays.asList(1L, 2L, 3L));  //SELECT id,name,age,email FROM user WHERE id IN ( ? , ? , ? )
//        users.forEach(System.out::println);

        List<User> users = userMapper.selectList(null); //SELECT id,name,age,email FROM user
        users.forEach(System.out::println);
    }

    @Test
    public void selectMapById(){
        Map<String, Object> map = userMapper.selectMapById(1L);
        System.out.println(map);
    }
}

package tech.dongfei.mybatisplus;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.dongfei.mybatisplus.pojo.User;
import tech.dongfei.mybatisplus.service.UserService;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class MyBatisPlusServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testGetCount(){
        long count = userService.count();  //SELECT COUNT( * ) FROM user
        System.out.println("count:"+count);
    }

    @Test
    public void testInsertMore(){
        List<User> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("user"+i);
            user.setAge(20+i);
            list.add(user);
        }
        boolean b = userService.saveBatch(list);  //INSERT INTO user ( id, name, age ) VALUES ( ?, ?, ? )
        System.out.println(b);
    }

    @Test
    public void testDelete(){
        userService.removeById(1L);
        userService.list().forEach(System.out::println);
    }

}

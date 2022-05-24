package tech.dongfei.mybatisplus;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tech.dongfei.mybatisplus.mapper.UserMapper;
import tech.dongfei.mybatisplus.pojo.User;

@SpringBootTest
public class MyBatisPlusPluginsTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testPage(){
        Page<User> page = new Page<>(1,3);  //当前页1，每页3条数据
        userMapper.selectPage(page, null);
        System.out.println(page.getRecords());  //获取记录
        System.out.println(page.getCurrent());  //当前页
        System.out.println(page.getSize());  //每页记录数
        System.out.println(page.getPages());  //总页码
        System.out.println(page.getTotal());  //总记录数
        System.out.println(page.hasNext());  //是否有下一页
        System.out.println(page.hasPrevious());  //是否有上一页
    }

    @Test
    public void testPageVo(){
        Page<User> page = new Page<>(1,3);
        userMapper.selectPageVo(page,20);
        System.out.println(page.getRecords());  //获取记录
        System.out.println(page.getCurrent());  //当前页
        System.out.println(page.getSize());  //每页记录数
        System.out.println(page.getPages());  //总页码
        System.out.println(page.getTotal());  //总记录数
        System.out.println(page.hasNext());  //是否有下一页
        System.out.println(page.hasPrevious());  //是否有上一页
    }
}

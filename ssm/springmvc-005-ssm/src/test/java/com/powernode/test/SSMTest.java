package com.powernode.test;

import com.powernode.mapper.UserMapper;
import com.powernode.pojo.User;
import com.powernode.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class SSMTest {
    @Autowired
    UserService userService;
    @Test
    public void Test1(){
        List<User> users = userService.selectUserPage(null, "女", 0);
        users.forEach(user -> {
            System.out.println(user);
        });
    }
}

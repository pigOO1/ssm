package com.powernode.controller;

import com.powernode.pojo.User;
import com.powernode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

    private static final int PAGE_SIZE = 5;

    @Autowired
    UserService userService;


    /**
     * /user/selectUserPage?userName=z&userSex=男&page=null
     */
    @RequestMapping("/selectUserPage")

    public List<User> selectUserPage(String userName, String userSex, Integer page){
        int startRow = 0;
        if(page != null){
            startRow = (page - 1) * PAGE_SIZE;
        }
        return userService.selectUserPage(userName, userSex, startRow);
    }
    /**
     * /user/getRowCount?userName=z&userSex=男
     */
    @RequestMapping("/getRowCount")

    public int getRowCount(String userName, String userSex){
        return userService.getRowCount(userName, userSex);
    }

    /**
     * /user/deleteUserById?userId= 15968162087363060
     */
    @RequestMapping("/deleteUserById")

    public int deleteUserById(String userId){
        return userService.deleteUserById(userId);
    }

    /**
     * /user/createUser(参数见下面)
     */
    @RequestMapping("/createUser")

    public int  createUser(User user){
        String userId = System.currentTimeMillis() + new Random(10).nextInt() + "";
        user.setUserId(userId);
        return userService.createUser(user);
    }
}

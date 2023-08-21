package com.powernode.service;

import com.powernode.pojo.User;

import java.util.List;

public interface UserService {
    /**
    * user/selectUserPage?userName=z&userSex=男&page=null
    */
    List<User> selectUserPage(String userName, String userSex, int startRow);

    /**
     * /user/createUser
     */
    int createUser(User user);
    /**
     * url	/user/ deleteUserById?userId= 15968162087363060
     */
    int deleteUserById(String userId);
    /**
     * /user/getRowCount?userName=z&userSex=男
     */
    int getRowCount(String userName, String userSex);
}

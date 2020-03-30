package com.talwin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class UserServiceTest {

    private IService iService= UserService.getInstance();

    private User user = new User("qwe","asd");
    private List<User> listUser = new ArrayList<>();


    @BeforeEach
    void addUser(){
        listUser.add(user);
        iService.saveUser(user);
    }

    @AfterEach
    void deleteUser(){
        listUser=null;
    }

    @Test
    void getUserList() {
        Assertions.assertEquals(listUser, iService.getUserList());
    }
}
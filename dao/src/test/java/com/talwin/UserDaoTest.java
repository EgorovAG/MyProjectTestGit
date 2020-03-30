package com.talwin;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;


class UserDaoTest {

    private IDao iDao = UserDao.getInstance();

    private List<User> list = new ArrayList<>();
    private User user = new User("qwe", "asd");

    @BeforeEach
    void addUser() {
        list.add(user);
        iDao.saveUser(user);
    }

    @AfterEach
    void dellUser(){
        list=null;
    }

    @Test
    void getUser() {
        Assertions.assertEquals(list, iDao.getUser());
    }
}
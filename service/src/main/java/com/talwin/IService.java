package com.talwin;

import java.util.List;

public interface IService {

    void saveUser(User user);

    List<User> getUserList();
}

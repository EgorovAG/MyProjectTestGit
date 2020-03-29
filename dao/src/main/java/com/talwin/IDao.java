package com.talwin;

import java.util.List;

public interface IDao {

    String saveUser (User user);

    List<User> getUser();
}

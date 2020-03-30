package com.talwin;

import java.util.List;

public interface IDao {

    void saveUser (User user);

    List<User> getUser();

    boolean IDaoValidateL(User user);

    boolean IDaoValidateR(User user);


}

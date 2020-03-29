package com.talwin;

import java.util.List;

public class UserDao implements IDao {

    private static volatile IDao instance;

    public static IDao getInstance() {
        IDao localInstance = instance;
        if (localInstance == null) {
            synchronized (IDao.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new UserDao();
                }
            }
        }
        return localInstance;
    }

    @Override
    public List<User> getUser() {
        return null;
    }

    @Override
    public String saveUser(User user) {
        return null;
    }
}


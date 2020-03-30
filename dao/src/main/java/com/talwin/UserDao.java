package com.talwin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserDao implements IDao {
    private List<User> listUser;
    private static volatile IDao instance;

    public UserDao() {
        this.listUser = new ArrayList<>();
    }

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
        return listUser;
    }

    @Override
    public void saveUser(User user) {
        listUser.add(user);
    }

    @Override
    public boolean IDaoValidateL(User user){
        boolean b = false;
        Iterator<User> iterator = listUser.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getLogin().equals(user.getLogin())) {
                b=true;
            } else {
                b=false;
            }
        }
        return b;
    }

    public boolean IDaoValidateR(User user){
        boolean b = false;
        Iterator<User> iterator = listUser.iterator();
        while(iterator.hasNext()){
            if (iterator.next().getLogin().equals(user.getLogin()) &&
                    iterator.next().getPassword().equals(user.getPassword())) {
                b=true;
            } else {
                b=false;
            }
        }
        return b;
    }


}


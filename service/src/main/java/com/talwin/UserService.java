package com.talwin;

import java.util.List;

public class UserService implements IService {

    IDao iDao = UserDao.getInstance();

    public static volatile IService instance;

    public static IService getInstance() {
        IService localInstance = instance;
        if (localInstance == null) {
            synchronized (IService.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new UserService();
                }
            }
        }
        return localInstance;
    }

    @Override
    public void saveUser(User user) {
        iDao.saveUser(user);
    }

    @Override
    public List<User> getUserList() {
        return iDao.getUser();
    }

    @Override
    public boolean ServiceValidateL(User user) {
        if (!Validate.validate(user)) {
//            listUser.add(user);
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean ServiceValidateR(User user) {
        if (!Validate.validate(user)) {
//            listUser.add(user);
            return false;
        } else {
            return true;
        }
    }

}

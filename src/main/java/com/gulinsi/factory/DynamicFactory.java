package com.gulinsi.factory;

import com.gulinsi.dao.UserDao;
import com.gulinsi.dao.impl.UserDaoImpl;

public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}

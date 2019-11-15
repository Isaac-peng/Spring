package com.gulinsi.factory;

import com.gulinsi.dao.UserDao;
import com.gulinsi.dao.impl.UserDaoImpl;

public class StaticFactory {



    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}

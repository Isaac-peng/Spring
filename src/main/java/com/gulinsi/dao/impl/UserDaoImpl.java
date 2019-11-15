package com.gulinsi.dao.impl;

import com.gulinsi.dao.UserDao;
import com.gulinsi.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private List<String> list;
    private Map<String, User> map;
    private Properties prop;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    /*    private String name;
    private int age;*/

/*    public UserDaoImpl() {
    }

    public UserDaoImpl(String name, int age) {
        this.name = name;
        this.age = age;
    }*/

   /* public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }*/

    public void Init(){
        System.out.println("初始化。。。");
    }
    public void Destory(){
        System.out.println("销毁。。。");
    }

    public void save() {
//        System.out.println(name+"==="+age);
        System.out.println(list);
        System.out.println(map);
        System.out.println(prop);
        System.out.println("Save()方法执行了 ...");
    }

}

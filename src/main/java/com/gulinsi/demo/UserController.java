package com.gulinsi.demo;

import com.gulinsi.dao.UserDao;
import com.gulinsi.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {
    public static void main(String[] args) {

    }

    /**
     * 单例
     */
    @Test
    public void demo1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao useDao1 = (UserDao) app.getBean("userDao");
        UserDao useDao2 = (UserDao) app.getBean("userDao");
        System.out.println(useDao1);
        System.out.println(useDao2);

    }

    /**
     * 多例
     */
    @Test
    public void demo2(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao useDao1 = (UserDao) app.getBean("userDao");
        UserDao useDao2 = (UserDao) app.getBean("userDao");
        System.out.println(useDao1);
        System.out.println(useDao2);

    }

    /**
     * 静态工厂
     */
    @Test
    public void demo3(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao useDao1 = (UserDao) app.getBean("userDao");
        useDao1.save();
        System.out.println(useDao1);
    }

    /**
     * 实例工厂
     */
    @Test
    public void demo4(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao useDao1 = (UserDao) app.getBean("userDao");
        useDao1.save();
        System.out.println(useDao1);
    }

    /**
     * 初始化 销毁
     */
    @Test
    public void demo5(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao useDao1 = (UserDao) app.getBean("userDao");
        useDao1.save();
        ((ClassPathXmlApplicationContext)(app)).close();
    }

    /**
     * 控制反转 依赖注入 set
     *  p 命名空间
     */
    @Test
    public void demo6(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) app.getBean("userService");
        userService.save();
    }

    /**
     * 控制反转 依赖注入 set
     *  p 命名空间
     */
    @Test
    public void demo7(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }
}

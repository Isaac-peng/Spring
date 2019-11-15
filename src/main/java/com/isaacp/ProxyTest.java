package com.isaacp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {
        final Target target = new Target();
        final Advice advice = new Advice();
int i = 0;
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                advice.PostConstruct();
                method.invoke(target, args);
                advice.BeforeDestory();
                return null;
            }
        });

        proxy.save();

    }
}

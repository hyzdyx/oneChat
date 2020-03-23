package com.huangyz.onechat;

import com.huangyz.onechat.dao.UserDao;
import com.huangyz.onechat.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.Servlet;
import java.io.*;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream in = Resources.getResourceAsStream("sqlmapConfig");
        InputStreamReader inputStreamReader = new InputStreamReader(in);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        StringBuilder stringBuilder = new StringBuilder();
//        String temp;
//        while ((temp = bufferedReader.readLine())!=null){
//            stringBuilder.append(temp);
//        };
//        System.out.println(stringBuilder.toString());
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = builder.build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = (UserDao) sqlSession.getMapper(UserDao.class);
        List<User> list = userDao.findPerson();
        list.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.println(user.getName());
            }
        });
    }
}


class Person implements Man {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Man person = new Person("hyz", 111);
//        Method method = person.getClass().getMethod("getId");
//        int id = (int) method.invoke(person, null);
//        System.out.println(id);

        Man proxyPerson = (Man) Proxy.newProxyInstance(Man.class.getClassLoader(), person.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("执行方法前");

                System.out.println("执行方法后");
                Object o = method.invoke(person, args);

                System.out.println("执行方法后");
                return o;
            }
        });
        System.out.println(proxyPerson.getId());

    }
}
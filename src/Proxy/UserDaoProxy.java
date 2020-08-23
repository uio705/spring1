package Proxy;

import java.io.Serializable;

public class UserDaoProxy implements Serializable,UserDao {
    private UserDao userDao  = new UserDaoImpl();



    @Override
    public void work() {
            System.out.println("开机");
            userDao.work();
            System.out.println("关机");
        }
    }


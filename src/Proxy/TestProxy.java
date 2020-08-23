package Proxy;

import java.io.Serializable;

public class TestProxy implements Serializable {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoProxy();
        userDao.work();

    }
}

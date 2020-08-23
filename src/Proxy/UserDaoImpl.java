package Proxy;

import java.io.Serializable;

public class UserDaoImpl implements UserDao,Serializable {
    @Override
    public void work() {
        System.out.println("工作");

    }



}

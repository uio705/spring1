package Proxy2;

public class TestProxy {
    public static void main(String[] args) {
        UserDao ud = new UserDaoImpl();
        UserDaoProxy proxy = new UserDaoProxy();
        UserDao proxyInstence = (UserDao) proxy.getProxy(ud);
        proxyInstence.work();
        System.out.println("-----");
        proxyInstence.work();
    }
}

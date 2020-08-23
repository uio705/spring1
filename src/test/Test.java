package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Print;

import java.awt.print.PrinterGraphics;
import java.io.Serializable;

public class Test implements Serializable {
    public static void main(String[] args) {
        ApplicationContext spring = new ClassPathXmlApplicationContext("spring-config.xml");
        Print p = (Print) spring.getBean("print");
        p.work();
    }
}

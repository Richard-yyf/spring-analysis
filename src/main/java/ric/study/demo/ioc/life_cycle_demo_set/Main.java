package ric.study.demo.ioc.life_cycle_demo_set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/17
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config-1.xml");
        ((ClassPathXmlApplicationContext) context).close();
    }
}

package ric.study.demo.ioc.autowire_all_implementation_demo_set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/23
 */
@Configuration
@ComponentScan("ric.study.demo.ioc.autowire_all_implementation_demo_set")
public class Boostrap {

    public static void main(String[] args) {
        String entNum = "entA";
        send(entNum);
//        entNum = "entB";
//        send(entNum);
//        entNum = "entC";
//        send(entNum);
    }

    public static void send(String entNum) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Boostrap.class);
        context.getBean(EntStrategyHolder.class).print();
//        context.getBean(EntStrategyHolder.class).getBy(EntAlias.of(entNum)).send();
    }
}

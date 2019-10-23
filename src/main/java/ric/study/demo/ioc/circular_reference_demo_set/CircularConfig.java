package ric.study.demo.ioc.circular_reference_demo_set;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/9
 */
@Configuration
@ComponentScan("ric.study.demo.ioc.circular_reference_demo_set")
public class CircularConfig {

    public static void main(String... strings) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CircularConfig.class);
        System.out.println("Spring container started and is ready");
        ((CircularBeanA)context.getBean("circularBeanA")).tell();
        ((CircularBeanB)context.getBean("circularBeanB")).tell();
        ((CircularBeanC)context.getBean("circularBeanC")).tell();
    }
}

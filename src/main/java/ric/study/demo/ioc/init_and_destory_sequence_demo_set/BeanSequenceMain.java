package ric.study.demo.ioc.init_and_destory_sequence_demo_set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/8
 */
public class BeanSequenceMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanSimpleConfig.class);
        ((Bean1)context.getBean("bean1")).tell();
        ((AnnotationConfigApplicationContext) context).destroy();
    }
}

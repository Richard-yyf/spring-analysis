package ric.study.demo.ioc.life_cycle_demo_set;

import org.springframework.beans.factory.BeanNameAware;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/17
 */
public class MyBeanNameAware implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        System.out.println("my bean name aware method is invoke");
    }
}

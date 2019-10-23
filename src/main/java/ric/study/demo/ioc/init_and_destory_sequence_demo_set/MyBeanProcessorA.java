package ric.study.demo.ioc.init_and_destory_sequence_demo_set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/9
 */
public class MyBeanProcessorA implements BeanPostProcessor, PriorityOrdered {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("ProcessorA, before, beanName: " + beanName);
        if (beanName.equals("bean1")) {
            return new Bean1("process generated Bean1");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("ProcessorA, after, beanName: " + beanName);
        return bean;
    }

    @Override
    public int getOrder() {
        return -1;
    }
}

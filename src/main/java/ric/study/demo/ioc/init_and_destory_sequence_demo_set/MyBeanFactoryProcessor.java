package ric.study.demo.ioc.init_and_destory_sequence_demo_set;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.PriorityOrdered;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/9
 */
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor, PriorityOrdered {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("===== BeanFactoryProcessor ======");
    }

    @Override
    public int getOrder() {
        return 0;
    }
}

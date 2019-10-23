package ric.study.demo.ioc.init_and_destory_sequence_demo_set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/7
 */
@Configuration
public class BeanSimpleConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Bean1 bean1() {
        return new Bean1();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Bean2 bean2() {
        return new Bean2();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Bean3 bean3() {
        return new Bean3();
    }

    @Bean("myBeanProcessorA")
    public MyBeanProcessorA myBeanProcessorA() {
        return new MyBeanProcessorA();
    }

    @Bean("myBeanProcessorB")
    public MyBeanProcessorB myBeanProcessorB() {
        return new MyBeanProcessorB();
    }

    @Bean
    public MyBeanFactoryProcessor myBeanFactoryProcessor() {
        return new MyBeanFactoryProcessor();
    }

    @Bean
    public MyBeanFactoryProcessorB myBeanFactoryProcessorB() {
        return new MyBeanFactoryProcessorB();
    }
}

package ric.study.demo.ioc.InitAndDestorySequenceDemoSet;

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
}

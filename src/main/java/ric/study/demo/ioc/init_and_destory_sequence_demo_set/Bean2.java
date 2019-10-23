package ric.study.demo.ioc.init_and_destory_sequence_demo_set;

import org.springframework.context.annotation.DependsOn;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/7
 */
@DependsOn("bean3")
public class Bean2 {

    public Bean2() {
        System.out.println("Bean2 构造器");
    }

    private void init() {
        System.out.println("Bean2 调用init-method");
    }

    private void destroy() {
        System.out.println("Bean2 调用destroy-method");
    }
}

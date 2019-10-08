package ric.study.demo.ioc.InitAndDestorySequenceDemoSet;

import org.springframework.context.annotation.DependsOn;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/7
 */
@DependsOn("bean3")
public class Bean2 {

    public Bean2() {
        System.out.println("Bean2 constructor");
    }

    private void init() {
        System.out.println("Bean2 init");
    }

    private void destroy() {
        System.out.println("Bean2 destroy");
    }
}

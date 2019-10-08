package ric.study.demo.ioc.InitAndDestorySequenceDemoSet;

import org.springframework.context.annotation.DependsOn;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/7
 */
@DependsOn("bean2")
public class Bean1 {

    public Bean1() {
        System.out.println("Bean1 constructor");
    }

    private void init() {
        System.out.println("Bean1 init");
    }

    private void destroy() {
        System.out.println("Bean1 destroy");
    }

    public void tell() {
        System.out.println("Bean1 is telling !");
    }
}

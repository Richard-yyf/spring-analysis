package ric.study.demo.ioc.InitAndDestorySequenceDemoSet;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/7
 */
public class Bean3 {

    public Bean3() {
        System.out.println("Bean3 constructor");
    }

    private void init() {
        System.out.println("Bean3 init");
    }

    private void destroy() {
        System.out.println("Bean3 destroy");
    }
}

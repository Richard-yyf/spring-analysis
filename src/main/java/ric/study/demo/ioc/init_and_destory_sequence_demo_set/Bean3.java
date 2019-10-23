package ric.study.demo.ioc.init_and_destory_sequence_demo_set;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/7
 */
public class Bean3 {

    public Bean3() {
        System.out.println("Bean3 构造器");
    }

    private void init() {
        System.out.println("Bean3 调用init-method");
    }

    public String tell() {
        return "bean3 is telling";
    }

    private void destroy() {
        System.out.println("Bean3 调用destroy-method");
    }
}

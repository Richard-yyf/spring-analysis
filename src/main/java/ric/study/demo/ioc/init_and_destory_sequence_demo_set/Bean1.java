package ric.study.demo.ioc.init_and_destory_sequence_demo_set;

import org.springframework.context.annotation.DependsOn;

import javax.annotation.PostConstruct;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/7
 */
@DependsOn("bean2")
public class Bean1 {

    private String name;

    public Bean1(String name) {
        this.name = name;
    }

    public Bean1() {
        System.out.println("Bean1 构造器");
    }

    private void init() {
        System.out.println("Bean1 调用init-method");
    }

    @PostConstruct
    private void posConstruct(){
        System.out.println("Bean1 调用 postConstruct");
    }

    private void destroy() {
        System.out.println("Bean1 调用destroy-method");
    }

    public void tell() {
        System.out.println("Bean1 is telling ! name:" + name);
    }
}

package ric.study.demo.aop;

import org.springframework.stereotype.Component;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/28
 */
@Component
public class TestAopBean {

    public void testExecution() {
        System.out.println("test aop bean is working");
    }

    @HaveAop
    public void testAnnotation() {
        System.out.println("test annotation now");
    }
}

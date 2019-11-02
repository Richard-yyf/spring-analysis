package ric.study.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import ric.study.demo.aop.controller.TestController;
import ric.study.demo.aop.svc.TestSvc;
import ric.study.demo.aop.svc.TestSvcImpl;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/28
 */
@Configuration
// 这样子就是默认使用CGLIB
//@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableAspectJAutoProxy
@ComponentScan("ric.study.demo.aop")
public class Boostrap {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Boostrap.class);
        TestController test = context.getBean(TestController.class);
        test.print("123");
        TestSvc svc = (TestSvc) context.getBean("testSvc");
        svc.process();
        System.out.println(context.getBean(TestSvcImpl.class));
        System.out.println(context.getBean("testSvcImpl"));
        context.getBean(TestAopBean.class).testAnnotation();
        context.getBean(TestAopBean.class).testExecution();

//        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:test-aop-1.xml");
//        context.getBean(TestController.class).print("110");
//        context.getBean(TestSvc.class).process();
//        context.getBean(TestAopBean.class).testAnnotation();
//        context.getBean(TestAopBean.class).testExecution();
    }
}

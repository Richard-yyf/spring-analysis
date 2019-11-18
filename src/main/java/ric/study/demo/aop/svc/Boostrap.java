package ric.study.demo.aop.svc;

import net.sf.cglib.core.DebuggingClassWriter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/28
 */
@Configuration
// 这样子就是默认使用CGLIB
@EnableAspectJAutoProxy(proxyTargetClass = true)
@ComponentScan("ric.study.demo.aop")
public class Boostrap {

    public static void main(String[] args) {
        // save 动态代理类class
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\studyProjects\\spring-analysis\\com\\cglib");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Boostrap.class);
        TestSvc svc = (TestSvc) context.getBean("testSvc");
        System.out.println(svc.getClass().getName());
        svc.process();
        System.out.println("==================");
        DateSvc dateSvc = (DateSvc) context.getBean("dateSvc");
        dateSvc.printDate(new Date());
    }
}

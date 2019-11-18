package ric.study.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/28
 */
@Aspect
@Component
public class PointCutConfig {

    // 指定 bean
    @Pointcut("bean(testAopBean)")
    public void isTestAopBean() {}

    // controller 层
    @Pointcut("bean(testController)")
    public void inControllerLayer() {}

    // service 层
    // ".." 代表包及其子包
    @Pointcut("within(ric.study.demo.aop.svc..*)")
    public void inSvcLayer() {}

    // 指定的方法
    @Pointcut("execution(* testExecution(..))")
    public void anyTestMethod() {}

    // 指定注解
    @Pointcut("@annotation(ric.study.demo.aop.HaveAop)")
    public void withAnnotation() {}
}

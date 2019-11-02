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

    // controller 层
    @Pointcut("bean(testController)")
    public void inControllerLayer() {}

    // service 层
    // ".." 代表包及其子包
    @Pointcut("within(ric.study.demo.aop.svc..*)")
    public void inSvcLayer() {}

    @Pointcut("execution(* testExecution(..))")
    public void anyTestMethod() {}

    @Pointcut("@annotation(ric.study.demo.aop.HaveAop)")
    public void withAnnotation() {}
}

package ric.study.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/29
 */
@Component
@Aspect
public class ServiceLogAspect {

    // 拦截，打印日志，并且通过JoinPoint 获取方法参数
    @Before("ric.study.demo.aop.PointCutConfig.inSvcLayer()")
    public void logBeforeSvc(JoinPoint joinPoint) {
        System.out.println("在service 方法执行前 打印第 1 次日志");
        System.out.println("拦截的service 方法的方法签名: " + joinPoint.getSignature());
        System.out.println("拦截的service 方法的方法入参: " + Arrays.toString(joinPoint.getArgs()));
    }


    // 这里是Advice和Pointcut 合在一起配置的方式
    @Before("within(ric.study.demo.aop.svc..*)")
    public void logBeforeSvc2() {
        System.out.println("在service的方法执行前 打印第 2 次日志");
    }

}

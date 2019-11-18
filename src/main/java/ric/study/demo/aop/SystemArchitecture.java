package ric.study.demo.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * @author Richard_yyf
 * @version 1.0 2019/11/4
 */
public class SystemArchitecture {

    @Pointcut("within(com.xyz.someapp.web..*)")
    public void inWebLayer() {}

    @Pointcut("within(com.xyz.someapp.service..*)")
    public void inServiceLayer() {}

    @Pointcut("within(com.xyz.someapp.dao..*)")
    public void inDataAccessLayer() {}

    @Pointcut("execution(* com.xyz.someapp.service.*.*(..))")
    public void businessService() {}

    @Pointcut("execution(* com.xyz.someapp.dao.*.*(..))")
    public void dataAccessOperation() {}
}

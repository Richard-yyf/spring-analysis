//package ric.study.demo.aop;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
///**
// * 注：实际开发过程当中，Advice切面应遵循单一职责，不应混在一起
// *
// * @author Richard_yyf
// * @version 1.0 2019/10/28
// */
//@Aspect
//@Component
//public class GlobalAopAdvice {
//
//    @Before("within(ric.study.demo.aop.svc..*)")
//    public void logBeforeSvc2() {
//        System.out.println("在service 层前打印日志 V2");
//    }
//
//    @Before("ric.study.demo.aop.PointCutConfig.inSvcLayer()")
//    public void logBeforeSvc(JoinPoint joinPoint) {
//        System.out.println("在service 层前打印日志");
//        System.out.println("拦截的service 方法的方法签名: " + joinPoint.getSignature());
//    }
//
//    @AfterReturning(
//            pointcut = "ric.study.demo.aop.PointCutConfig.inControllerLayer()",
//            returning = "retVal"
//    )
//    public void logAfterControllerLay(Object retVal) {
//        System.out.println("controller 层返回之后打印返回值：" + retVal);
//    }
//
//
//    @AfterReturning(
//            pointcut = "ric.study.demo.aop.PointCutConfig.inControllerLayer()"
//    )
//    public void logAfterControllerLay2() {
//        System.out.println("controller 层之后打印日志 V2");
//    }
//
//    // 注意理解它和 @AfterReturning 之间的区别，这里会拦截正常返回和异常的情况
//    @After("ric.study.demo.aop.PointCutConfig.withAnnotation()")
//    public void logAfterAnnotationMethod() {
//        // after return 的逻辑地位就好像finally
//        System.out.println("在 annotation 方法结束之后 打印日志");
//    }
//
//    @Around("ric.study.demo.aop.PointCutConfig.anyTestMethod()")
//    public Object processTestMethod(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("========== 在 test方法之前 打印日志 ===========");
//        System.out.println("args:" + Arrays.toString(pjp.getArgs())
//                + "\n Signature: " + pjp.getSignature()
//                + "\n Target" + pjp.getTarget());
//        Object val = pjp.proceed();
//        System.out.println("在 test方法之后 打印日志" + val);
//        return val;
//    }
//    @After("ric.study.demo.aop.PointCutConfig.isTestAopBean()")
//    public void processTestAopBean()  {
//        System.out.println("在 TestAopBean 所有方法后面打印日志");
//    }
//
//}

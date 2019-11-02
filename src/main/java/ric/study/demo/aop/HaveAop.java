package ric.study.demo.aop;

import java.lang.annotation.*;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/28
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface HaveAop {
}

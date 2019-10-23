package ric.study.demo.ioc.circular_reference_demo_set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/10
 */
@Component
public class CircularBeanC {

    @Autowired
    private CircularBeanA circularBeanA;

    public void tell() {
        System.out.println("C hold A" + circularBeanA.toString());
    }
}

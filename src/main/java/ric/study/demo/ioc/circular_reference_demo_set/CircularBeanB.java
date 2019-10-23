package ric.study.demo.ioc.circular_reference_demo_set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/9
 */
@Component
public class CircularBeanB {

    @Autowired
    private CircularBeanC circularBeanc;

    public void tell() {
        System.out.println("B hold C" + circularBeanc.toString());
    }
}

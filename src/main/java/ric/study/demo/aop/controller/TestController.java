package ric.study.demo.aop.controller;

import org.springframework.stereotype.Component;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/28
 */
@Component
public class TestController {

    public String print(String entNum) {
        System.out.println("test controller is working");
        return "加工之后的" + entNum;
    }
}

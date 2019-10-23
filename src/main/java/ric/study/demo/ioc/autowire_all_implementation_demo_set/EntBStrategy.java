package ric.study.demo.ioc.autowire_all_implementation_demo_set;

import org.springframework.stereotype.Component;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/23
 */
@Component
public class EntBStrategy implements EntStrategy {
    @Override
    public String getStuff() {
        return "企业B";
    }

    @Override
    public void send() {
        System.out.println("发送B标准的报文给对应企业");
    }

    @Override
    public String toString() {
        return getStuff();
    }
}

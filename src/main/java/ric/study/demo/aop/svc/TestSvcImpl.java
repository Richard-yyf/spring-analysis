package ric.study.demo.aop.svc;


import org.springframework.stereotype.Service;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/29
 */
@Service("testSvc")
public class TestSvcImpl implements TestSvc {
    @Override
    public void process() {
        System.out.println("test svc is working");
    }
}

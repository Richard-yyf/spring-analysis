package ric.study.demo.aop.svc;

import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Richard_yyf
 * @version 1.0 2019/11/4
 */
@Service("dateSvc")
public class DateSvcImpl implements DateSvc {

    @Override
    public void printDate(Date date) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
    }
}

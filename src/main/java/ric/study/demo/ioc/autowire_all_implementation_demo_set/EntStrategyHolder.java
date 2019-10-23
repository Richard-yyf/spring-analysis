package ric.study.demo.ioc.autowire_all_implementation_demo_set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/23
 */
@Component
public class EntStrategyHolder {

    @Autowired
    private Map<String, EntStrategy> entStrategyMap;

    @Autowired
    private List<EntStrategy> entStrategyList;

    public EntStrategy getBy(String entNum) {
        return entStrategyMap.get(entNum);
    }

    public void print() {
        System.out.println("===== implementation Map =====");
        System.out.println(entStrategyMap);
        entStrategyMap.forEach((name, impl)-> {
            System.out.println(name + ":" + impl.getStuff());
        });
        System.out.println("===== implementation List =====");
        System.out.println(entStrategyList);
        entStrategyList.forEach(impl-> System.out.println(impl.getStuff()));
    }
}

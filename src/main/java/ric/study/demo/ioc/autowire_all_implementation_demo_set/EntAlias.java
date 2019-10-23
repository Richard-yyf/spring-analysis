package ric.study.demo.ioc.autowire_all_implementation_demo_set;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Richard_yyf
 * @version 1.0 2019/10/23
 */
public class EntAlias {

    private static Map<String, String> aliasMap;

    private static final String ENTA_STATEGY_NAME = "entAStrategy";
    private static final String ENTB_STATEGY_NAME = "entBStrategy";
    public static final String DEFAULT_STATEGY_NAME = "defaultStrategy";

    static {
        aliasMap = new LinkedHashMap<>();
        aliasMap.put("entA", ENTA_STATEGY_NAME);
        aliasMap.put("entB", ENTB_STATEGY_NAME);
    }

    public static String of(String entNum) {
        return aliasMap.get(entNum) == null ? DEFAULT_STATEGY_NAME : aliasMap.get(entNum);
    }
}

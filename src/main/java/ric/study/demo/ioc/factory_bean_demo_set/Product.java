package ric.study.demo.ioc.factory_bean_demo_set;

import lombok.Builder;
import lombok.Data;

/**
 * @author Richard_yyf
 * @version 1.0 2019/9/21
 */
@Data
@Builder
public class Product {

    private Material material;

    private ProduceLocation location;

    private double price;
}

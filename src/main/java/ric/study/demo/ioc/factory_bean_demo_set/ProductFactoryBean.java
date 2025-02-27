package ric.study.demo.ioc.factory_bean_demo_set;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Richard_yyf
 * @version 1.0 2019/9/21
 */
@Setter
@Getter
public class ProductFactoryBean implements FactoryBean<Product> {

    private Material material;

    private ProduceLocation produceLocation;

    @Override
    public Product getObject() throws Exception {
        return Product.builder()
                .location(produceLocation)
                .material(material)
                .price(cal(material, produceLocation))
                .build();
    }

    private double cal(Material material, ProduceLocation produceLocation) {
        return material.getPricePerGram() * material.getWeight()
                + produceLocation.getDistanceKm() * produceLocation.getPricePerPerKm();
    }

    @Override
    public Class<?> getObjectType() {
        return Product.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}

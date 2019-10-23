package ric.study.demo.ioc;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import ric.study.demo.ioc.factory_bean_demo_set.Product;

/**
 * @author Richard_yyf
 * @version 1.0 2019/9/21
 */
public class Bootstrap {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test-config.xml");
//        HolderA holderA = (HolderA) context.getBean("holderA");
//        HolderB holderB = (HolderB) context.getBean("holderB");
//        holderA.tell();
//        holderB.tell();

        // ========= FactoryBean test demo start =====================
        Product product = (Product) context.getBean("product");
        System.out.println(product.toString());

//        FactoryBean<Product> factoryBean = (ProductFactoryBean) context.getBean("&product");
//        System.out.println(factoryBean.getObject().toString());

//        FactoryBean<Car> carFactoryBean = (FactoryBean<Car>) context.getBean("&car");
//        Car car = (Car) context.getBean("car");
//        System.out.println(car);
//        System.out.println(carFactoryBean.getObject().toString());
        // ========= FactoryBean test demo end =====================
    }
}

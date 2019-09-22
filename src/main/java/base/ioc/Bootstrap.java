package base.ioc;

import base.SimpleBean;
import base.ioc.FactoryBeanDemoSet.Car;
import base.ioc.FactoryBeanDemoSet.Product;
import base.ioc.FactoryBeanDemoSet.ProductFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Richard_yyf
 * @version 1.0 2019/9/21
 */
public class Bootstrap {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test-config.xml");

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

package base.ioc;

import base.ioc.FactoryBeanDemoSet.Product;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author Richard_yyf
 * @version 1.0 2019/9/22
 */
public class SimpleInvokeIoCBootstrap {

    public static void main(String[] args) {
        ClassPathResource res = new ClassPathResource("test-config.xml");
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(res);
        Product product = (Product) factory.getBean("product");
        System.out.println(product.toString());
    }
}

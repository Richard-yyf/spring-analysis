package base.ioc.FactoryBeanDemoSet;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author Richard_yyf
 * @version 1.0 2019/9/21
 */
public class CarFactoryBean implements FactoryBean<Car> {

    private String carInfo;

    public static final String SPLIT = ",";

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] infos = carInfo.split(SPLIT);
        car.setBrand(infos[0]);
        car.setMaxSpeed(Integer.valueOf(infos[1]));
        car.setPrice(Double.valueOf(infos[2]));
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}

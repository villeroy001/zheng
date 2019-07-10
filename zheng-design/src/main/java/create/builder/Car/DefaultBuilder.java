package create.builder.Car;

/**
 * @author weiyixiao
 * @version id: DefaultBuilder.java, v 0.1 2019年07月09日 16:16:54 weiyixiao Exp $
 */
public class DefaultBuilder implements CarBuild {

    Car car = new Car();


    @Override
    public DefaultBuilder setName(String name) {
        car.setName(name);
        return this;
    }

    @Override
    public DefaultBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public DefaultBuilder setMode(String mode) {
        car.setModel(mode);
        return this;
    }

    public Car build(){
        return car;
    }
}

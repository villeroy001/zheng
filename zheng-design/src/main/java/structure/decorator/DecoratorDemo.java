package structure.decorator;

/**
 * @author weiyixiao
 * @version id: DecoratorDemo.java, v 0.1 2019年07月09日 18:16:13 weiyixiao Exp $
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        Car car = new SportCar();
        Wrapper wrapper = new Decorator(car);

        wrapper.show("sport car");
        ((Decorator) wrapper).color("红色");
    }
}

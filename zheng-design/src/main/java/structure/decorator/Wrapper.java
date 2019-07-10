package structure.decorator;

/**
 * @author weiyixiao
 * @version id: Wrapper.java, v 0.1 2019年07月09日 18:13:45 weiyixiao Exp $
 */
public abstract class Wrapper implements Car {

    Car car;

    public Wrapper(Car car) {
        this.car = car;
    }

    @Override
    public void show(String name) {
        show(name);
    }
}

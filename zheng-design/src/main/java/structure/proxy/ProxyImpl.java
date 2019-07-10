package structure.proxy;

/**
 * @author weiyixiao
 * @version id: ProxyImpl.java, v 0.1 2019年07月09日 18:21:06 weiyixiao Exp $
 */
public class ProxyImpl{

    Car car;

    public void getName(String name){
        car.getName(name);
    }

    public Car getInstance(){
        car = new SportCar();
        return car;
    }
}

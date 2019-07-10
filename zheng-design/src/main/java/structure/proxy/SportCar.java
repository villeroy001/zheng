package structure.proxy;

/**
 * @author weiyixiao
 * @version id: SportCar.java, v 0.1 2019年07月09日 18:20:11 weiyixiao Exp $
 */
public class SportCar implements Car {

    @Override
    public void getName(String name) {
        System.out.println("name");
    }
}

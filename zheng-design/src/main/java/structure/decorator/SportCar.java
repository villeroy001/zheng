package structure.decorator;

/**
 * @author weiyixiao
 * @version id: SportCar.java, v 0.1 2019年07月09日 18:12:32 weiyixiao Exp $
 */
public class SportCar implements Car {

    @Override
    public void show(String name) {
        System.out.println("跑车");
    }
}

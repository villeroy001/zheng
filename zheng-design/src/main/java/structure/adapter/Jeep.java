package structure.adapter;

/**
 * @author weiyixiao
 * @version id: Jeep.java, v 0.1 2019年07月09日 17:26:36 weiyixiao Exp $
 */
public class Jeep implements Car {
    @Override
    public void driver(String name) {
        System.out.println("吉普车");
    }

    @Override
    public void hight() {

    }
}

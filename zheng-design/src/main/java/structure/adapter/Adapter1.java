package structure.adapter;

/**
 * 类适配器
 * @author weiyixiao
 * @version id: Adapter1.java, v 0.1 2019年07月09日 17:27:37 weiyixiao Exp $
 */
public class Adapter1 extends Jeep implements Car {

    @Override
    public void driver(String name) {
        System.out.println("适配器1start");
        super.driver(name);
        System.out.println("适配器1end");
    }

    @Override
    public void hight() {

    }
}

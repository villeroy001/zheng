package structure.adapter;

/**
 * 对象适配器
 * @author weiyixiao
 * @version id: Adapter2.java, v 0.1 2019年07月09日 17:32:58 weiyixiao Exp $
 */
public class Adapter2 implements Car {

    Car jeep;

    @Override
    public void driver(String name) {
        System.out.println("适配器2start");
        jeep.driver(name);
        System.out.println("适配器2end");
    }

    @Override
    public void hight() {

    }

    public Adapter2(Car jeep) {
        this.jeep = jeep;
    }
}

package structure.adapter;

/**
 * @author weiyixiao
 * @version id: Sport.java, v 0.1 2019年07月09日 16:53:22 weiyixiao Exp $
 */
public class Sport implements Car {

    @Override
    public void driver(String name) {
        System.out.println("跑车");
    }

    @Override
    public void hight() {

    }
}

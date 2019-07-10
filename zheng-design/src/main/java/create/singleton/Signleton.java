package create.singleton;

/**
 * 懒汉模式：线程不安全
 * 饿汉模式：线程安全
 *
 * @author weiyixiao
 * @version id: Signleton.java, v 0.1 2019年07月09日 15:02:16 weiyixiao Exp $
 */
public class Signleton {

    private static final Signleton signleton = new Signleton();

    public Signleton getInstance(){
        return signleton;
    }
}

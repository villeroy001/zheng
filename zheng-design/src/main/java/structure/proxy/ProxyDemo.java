package structure.proxy;

/**
 * @author weiyixiao
 * @version id: ProxyDemo.java, v 0.1 2019年07月09日 18:21:42 weiyixiao Exp $
 */
public class ProxyDemo {

    public static void main(String[] args) {
        ProxyImpl proxy = new ProxyImpl();
        proxy.getInstance();
        proxy.getName("代理跑车");
    }
}

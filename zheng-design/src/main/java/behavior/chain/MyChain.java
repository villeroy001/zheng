package behavior.chain;

/**
 * @author weiyixiao
 * @version id: MyChain.java, v 0.1 2019年07月10日 15:47:54 weiyixiao Exp $
 */
public class MyChain extends AbstractChain {

    private String name;

    public MyChain(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println("name:" + name);
        super.operate();
    }
}

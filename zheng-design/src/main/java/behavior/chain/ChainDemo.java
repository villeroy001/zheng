package behavior.chain;

/**
 * @author weiyixiao
 * @version id: ChainDemo.java, v 0.1 2019年07月10日 15:49:20 weiyixiao Exp $
 */
public class ChainDemo {

    public static void main(String[] args) {
        MyChain chain1 = new MyChain("aaa");
        MyChain chain2 = new MyChain("bbb");
        MyChain chain3 = new MyChain("ccc");

        chain1.setChain(chain2);
        chain2.setChain(chain3);

        chain1.operate();
    }
}

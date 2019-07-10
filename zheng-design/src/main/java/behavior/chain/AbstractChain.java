package behavior.chain;

/**
 * @author weiyixiao
 * @version id: AbstractChain.java, v 0.1 2019年07月10日 15:46:26 weiyixiao Exp $
 */
public class AbstractChain implements Chain {

    private Chain chain;

    @Override
    public void operate() {
        if (chain != null){
            chain.operate();
        }
    }

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }
}

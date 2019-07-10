package behavior.strategy;

/**
 * @author weiyixiao
 * @version id: Plus.java, v 0.1 2019年07月10日 11:44:39 weiyixiao Exp $
 */
public class Plus extends AbstractCal {

    @Override
    int doCalcule(int num1, int num2) {
        return num1+num2;
    }


}

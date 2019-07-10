package behavior.template;

/**
 * @author weiyixiao
 * @version id: AbstractCal.java, v 0.1 2019年07月10日 11:45:43 weiyixiao Exp $
 */
public abstract class AbstractCal implements Calcule {

    @Override
    public int calcule(String num1, String num2) {
        int result = doCalcule(Integer.valueOf(num1), Integer.valueOf(num2));
        return result;
    }

    abstract int doCalcule(int num1, int num2);
}

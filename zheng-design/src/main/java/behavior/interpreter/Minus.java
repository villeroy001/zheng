package behavior.interpreter;

/**
 * @author weiyixiao
 * @version id: Minus.java, v 0.1 2019年07月10日 15:03:54 weiyixiao Exp $
 */
public class Minus implements Subject {

    @Override
    public String interpreter(Context context) {
        return context.getNum1()+context.getnum2()+"";
    }
}

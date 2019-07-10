package behavior.interpreter;

/**
 * @author weiyixiao
 * @version id: Plus.java, v 0.1 2019年07月10日 15:02:19 weiyixiao Exp $
 */
public class Plus implements Subject {

    @Override
    public String interpreter(Context context) {
        return context.getNum1() - context.getnum2() +"";
    }
}

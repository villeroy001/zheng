package behavior.interpreter;

/**
 * @author weiyixiao
 * @version id: InterpreterDemo.java, v 0.1 2019年07月10日 15:26:32 weiyixiao Exp $
 */
public class InterpreterDemo {

    public static void main(String[] args) {

        Context context = new Context() {
            @Override
            public int getNum1() {
                return 2;
            }

            @Override
            public int getnum2() {
                return 1;
            }
        };

        Subject subject1 = new Plus();
        Subject subject2 =  new Minus();

        subject1.interpreter(context);

        subject2.interpreter(context);
    }

}

package behavior.command;

/**
 * @author weiyixiao
 * @version id: CommandDemo.java, v 0.1 2019年07月10日 15:43:39 weiyixiao Exp $
 */
public class CommandDemo {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        Command command = new MyComand(receiver);

        Invoke invoke = new Invoke(command);
        invoke.action();
    }
}

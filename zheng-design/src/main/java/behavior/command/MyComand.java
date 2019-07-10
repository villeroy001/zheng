package behavior.command;

/**
 * @author weiyixiao
 * @version id: MyComand.java, v 0.1 2019年07月10日 15:40:50 weiyixiao Exp $
 */
public class MyComand implements Command {

    Receiver receiver ;

    @Override
    public void execute() {
        receiver.readColor();
    }

    public MyComand(Receiver receiver) {
        this.receiver = receiver;
    }
}

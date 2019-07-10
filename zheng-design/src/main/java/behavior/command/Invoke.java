package behavior.command;

/**
 * @author weiyixiao
 * @version id: Invoke.java, v 0.1 2019年07月10日 15:40:16 weiyixiao Exp $
 */
public class Invoke {

    Command command;

    public void action(){
        command.execute();
    }

    public Invoke(Command command) {
        this.command = command;
    }
}

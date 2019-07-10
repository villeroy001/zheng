package create.factory;

/**
 * @author weiyixiao
 * @version id: SmsSender.java, v 0.1 2019年07月09日 15:35:17 weiyixiao Exp $
 */
public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("smsSender create");
    }
}

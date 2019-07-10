package create.factory;

/**
 * @author weiyixiao
 * @version id: MailSender.java, v 0.1 2019年07月09日 15:34:51 weiyixiao Exp $
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("mailSender create");
    }
}

package create.factory;

/**
 * @author weiyixiao
 * @version id: MailFactory.java, v 0.1 2019年07月09日 15:37:36 weiyixiao Exp $
 */
public class MailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}

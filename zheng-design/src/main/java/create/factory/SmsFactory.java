package create.factory;

/**
 * @author weiyixiao
 * @version id: SmsFactory.java, v 0.1 2019年07月09日 15:38:28 weiyixiao Exp $
 */
public class SmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

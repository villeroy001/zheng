package create.factory;

/**
 * @author weiyixiao
 * @version id: Demo.java, v 0.1 2019年07月09日 15:40:30 weiyixiao Exp $
 */
public class Demo {

    public static void main(String[] args) {

        Provider provider = new MailFactory();
        provider.produce().send();

        Provider provider1 = new SmsFactory();
        provider1.produce().send();

    }
}

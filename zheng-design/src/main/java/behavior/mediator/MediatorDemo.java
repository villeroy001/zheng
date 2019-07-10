package behavior.mediator;

/**
 * @author weiyixiao
 * @version id: MediatorDemo.java, v 0.1 2019年07月10日 14:44:38 weiyixiao Exp $
 */
public class MediatorDemo {

    public static void main(String[] args) {

        Mediator mediator = new MediatorContext();

        Person person1 = new Man("man", 18, 1, mediator);
        Person person2 = new Woman("woman", 17, 2, mediator);

        person1.action();
        person2.action();

    }

}

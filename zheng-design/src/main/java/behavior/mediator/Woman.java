package behavior.mediator;

/**
 * @author weiyixiao
 * @version id: Woman.java, v 0.1 2019年07月10日 14:42:11 weiyixiao Exp $
 */
public class Woman extends Person {


    public Woman(String name, int age, int sex, Mediator mediator) {
        super(name, age, sex, mediator);
        mediator.register(this);
    }
}

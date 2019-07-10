package behavior.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiyixiao
 * @version id: MediatorContext.java, v 0.1 2019年07月10日 14:43:03 weiyixiao Exp $
 */
public class MediatorContext implements Mediator {

    private List<Person> personList = new ArrayList<>(16);

    @Override
    public void register(Person person) {
        personList.add(person);
    }

    @Override
    public void action() {
        personList.forEach(e->{
            System.out.println(e.getName()+e.getSex()+e.getAge());
        });
    }
}

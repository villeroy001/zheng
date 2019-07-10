package behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiyixiao
 * @version id: AbstractSubject.java, v 0.1 2019年07月10日 14:22:45 weiyixiao Exp $
 */
public abstract class AbstractSubject implements Subject {

    private List<Observer> observerList = new ArrayList<>(16);

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyNotice() {
        observerList.forEach(e->{
            e.update();
        });
    }

    abstract void operation();

}

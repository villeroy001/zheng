package behavior.observer;

/**
 * @author weiyixiao
 * @version id: Subject.java, v 0.1 2019年07月10日 14:21:27 weiyixiao Exp $
 */
public interface Subject {

    void add(Observer observer);

    void remove(Observer observer);

    void notifyNotice();
}

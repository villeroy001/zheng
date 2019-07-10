package behavior.observer;

/**
 * @author weiyixiao
 * @version id: ObserverDemo.java, v 0.1 2019年07月10日 14:26:53 weiyixiao Exp $
 */
public class ObserverDemo {

    public static void main(String[] args) {

        Observer observer1 = new Observer1();
        Observer observer2 = new Observer2();

        Subject subject = new MySubject();
        subject.add(observer1);
        subject.add(observer2);

        subject.notifyNotice();

    }
}

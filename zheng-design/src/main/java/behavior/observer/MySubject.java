package behavior.observer;

/**
 * @author weiyixiao
 * @version id: MySubject.java, v 0.1 2019年07月10日 14:24:34 weiyixiao Exp $
 */
public class MySubject extends AbstractSubject {

    @Override
    public void operation(){
        notifyNotice();
    }
}

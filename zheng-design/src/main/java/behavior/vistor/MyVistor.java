package behavior.vistor;

/**
 * @author weiyixiao
 * @version id: MyVistor.java, v 0.1 2019年07月10日 13:42:47 weiyixiao Exp $
 */
public class MyVistor implements Vistor {

    @Override
    public void vistor(Subject subject){
        subject.action();
    }

}

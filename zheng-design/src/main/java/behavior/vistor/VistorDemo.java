package behavior.vistor;

/**
 * @author weiyixiao
 * @version id: VistorDemo.java, v 0.1 2019年07月10日 14:04:22 weiyixiao Exp $
 */
public class VistorDemo {

    public static void main(String[] args) {

        Subject subject = new MySubject();
        Vistor vistor = new MyVistor();

        subject.accept(vistor);

    }
}

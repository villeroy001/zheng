package behavior.vistor;

/**
 * @author weiyixiao
 * @version id: Subject.java, v 0.1 2019年07月10日 14:10:19 weiyixiao Exp $
 */
public interface Subject {

    String action();

    void accept(Vistor vistor);
}

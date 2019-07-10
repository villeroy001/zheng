package behavior.vistor;

/**
 * @author weiyixiao
 * @version id: MySubject.java, v 0.1 2019年07月10日 14:01:27 weiyixiao Exp $
 */
public class MySubject implements Subject{

    @Override
    public String action(){
        return "目标对象操作";
    }

    @Override
    public void accept(Vistor vistor){
        vistor.vistor(this);
    }

}

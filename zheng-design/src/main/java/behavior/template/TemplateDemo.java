package behavior.template;

/**
 * @author weiyixiao
 * @version id: StrategyDemo.java, v 0.1 2019年07月10日 11:50:05 weiyixiao Exp $
 */
public class TemplateDemo {

    public static void main(String[] args) {
        Calcule calcule = new Plus();
        calcule.calcule("2","1");
    }

}

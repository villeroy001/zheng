package structure.decorator;

/**
 * @author weiyixiao
 * @version id: Decorator.java, v 0.1 2019年07月09日 18:15:02 weiyixiao Exp $
 */
public class Decorator extends Wrapper {


    public Decorator(Car car) {
        super(car);
    }

    public void color(String color){
        System.out.println(color+"涂颜色");
    }

    @Override
    public void show(String name) {
        super.show(name);

        color("red");
    }
}

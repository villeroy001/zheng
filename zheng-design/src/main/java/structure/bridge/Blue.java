package structure.bridge;

/**
 * @author weiyixiao
 * @version id: Blue.java, v 0.1 2019年07月10日 11:30:50 weiyixiao Exp $
 */
public class Blue implements Color {

    @Override
    public String getColor(String color) {
        return "blueColor:"+color;
    }

}

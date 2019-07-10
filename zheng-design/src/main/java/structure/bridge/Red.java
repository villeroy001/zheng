package structure.bridge;

/**
 * @author weiyixiao
 * @version id: Red.java, v 0.1 2019年07月10日 11:29:12 weiyixiao Exp $
 */
public class Red implements Color {

    @Override
    public String getColor(String color) {
        return "redColor:"+color;
    }

}

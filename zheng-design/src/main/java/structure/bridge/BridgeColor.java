package structure.bridge;

/**
 * @author weiyixiao
 * @version id: BridgeColor.java, v 0.1 2019年07月10日 11:31:32 weiyixiao Exp $
 */
public class BridgeColor {

    Color color;

    public void setSouce(Color color){
        this.color = color;
    }

    public String getColorName(){
        return color.getColor("aaa");
    }
}

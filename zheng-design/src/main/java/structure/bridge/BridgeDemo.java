package structure.bridge;

/**
 * @author weiyixiao
 * @version id: BridgeDemo.java, v 0.1 2019年07月10日 11:38:27 weiyixiao Exp $
 */
public class BridgeDemo {
    public static void main(String[] args) {
        BridgeColor bridgeColor = new BridgeColor();
        Color color = new Red();
        bridgeColor.setSouce(color);

        System.out.println(bridgeColor.getColorName());
    }
}

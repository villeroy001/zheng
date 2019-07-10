package create.builder.Car;

/**
 * @author weiyixiao
 * @version id: CarBuild.java, v 0.1 2019年07月09日 16:16:18 weiyixiao Exp $
 */
public interface CarBuild {

    public DefaultBuilder setName(String name);
    public DefaultBuilder setColor(String color);
    public DefaultBuilder setMode(String mode);
}

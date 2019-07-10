package create.builder;

import create.builder.Car.Car;
import create.builder.Car.CarBuild;
import create.builder.Car.DefaultBuilder;

/**
 * @author weiyixiao
 * @version id: Demo.java, v 0.1 2019年07月09日 15:50:55 weiyixiao Exp $
 */
public class Demo {

    public static void main(String[] args) {

        //方式1
        DefaultMail.MailBuilder mailBuilder = new DefaultMail.MailBuilder();
        DefaultMail defaultMail = mailBuilder.setTitle("111").setReceiver("222").setContent("333").build();


        //方式2
        CarBuild carBuild = new DefaultBuilder();
        Car car = carBuild.setName("auto").setColor("blue").setMode("A4").build();

    }
}

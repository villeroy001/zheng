package create.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weiyixiao
 * @version id: ProtoType.java, v 0.1 2019年07月09日 15:10:25 weiyixiao Exp $
 */
public class ProtoType {

    static List<String> receiverList=null;
    static {
        List<String> receiverList = new ArrayList<>(16);
        receiverList.add("weiyixao");
        receiverList.add("boch");
        receiverList.add("villeroy");
        receiverList.add("robinson");
    }

    public static void main(String[] args) {
        Mail mail = new Mail("title","content");

        for (int i=0 ; i<4 ; i++){
            Mail mail1 = mail.clone();
            mail1.setReceiver(receiverList.get(i));

            sendMail(mail1);
        }
    }

    public static void sendMail(Mail mail){
        System.out.println("邮件发送");
    }

}

package create.prototype;

/**
 * @author weiyixiao
 * @version id: Mail.java, v 0.1 2019年07月09日 15:15:48 weiyixiao Exp $
 */
public class Mail implements Cloneable{

    /**
     * 接收人
     */
    private String receiver;

    /**
     * 标题
     */
    private String title;

    /**
     * 发送内容
     */
    private String content;

    @Override
    public Mail clone() {
        Mail clone = null;
        try {
            clone = (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }

    public Mail(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

package create.builder;

/**
 * @author weiyixiao
 * @version id: DefaultMail.java, v 0.1 2019年07月09日 15:46:48 weiyixiao Exp $
 */
public class DefaultMail implements Mail {

    public DefaultMail() {
    }

    public DefaultMail(MailBuilder mailBuilder) {
        new Mail(){

            @Override
            public String title() {
                return mailBuilder.title;
            }

            @Override
            public String receiver() {
                return mailBuilder.content;
            }

            @Override
            public String content() {
                return mailBuilder.content;
            }

        };
    }

    @Override
    public String title() {
        return "title";
    }

    @Override
    public String receiver() {
        return "weiyixiao";
    }

    @Override
    public String content() {
        return "mail content";
    }

     static class MailBuilder {

        private String title;
        private String receiver;
        private String content;

         public MailBuilder() {
         }

         public MailBuilder setTitle(String title){
             title = title;
             return this;
         }

         public MailBuilder setReceiver(String receiver){
             receiver = receiver;
             return this;
         }

         public MailBuilder setContent(String content){
             content = content;
             return this;
         }


        public DefaultMail build(){
            return new DefaultMail(this);
        }


    }
}

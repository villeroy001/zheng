package behavior.mediator;

/**
 * @author weiyixiao
 * @version id: Person.java, v 0.1 2019年07月10日 14:39:01 weiyixiao Exp $
 */
public class Person {

    private String name;
    private int age;
    private int sex;

    private Mediator mediator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public Person(String name, int age, int sex, Mediator mediator) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mediator = mediator;
    }

    public void action(){
        mediator.action();
    }
}

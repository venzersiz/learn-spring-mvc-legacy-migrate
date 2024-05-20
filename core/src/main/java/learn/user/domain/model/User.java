package learn.user.domain.model;

public class User {

    private Long seq;

    private String name;

    private int age;

    protected User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Long getSeq() {
        return seq;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
            "seq=" + seq +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
    }
}

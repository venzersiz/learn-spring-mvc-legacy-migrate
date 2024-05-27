package learn.admin.user.domain.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class User {

    private Long seq;

    private String name;

    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

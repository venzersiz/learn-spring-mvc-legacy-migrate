package learn.api.user;

import java.util.List;
import learn.api.user.domain.model.User;
import learn.api.user.domain.repository.UserMapper;
import learn.api.user.presentation.model.FindUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final Environment env;

    private final UserMapper userMapper;

    @GetMapping("/someone")
    public FindUserResponse findUser() {
        List<User> users = userMapper.selectAll();

        if (users.isEmpty()) {
            userMapper.insert(new User("호랑나비", 137));
            users = userMapper.selectAll();
        }

        return new FindUserResponse(users.get(0), env.getProperty("app.env"));
    }
}

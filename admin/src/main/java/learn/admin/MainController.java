package learn.admin;

import java.util.List;
import learn.admin.user.domain.model.User;
import learn.admin.user.domain.repository.UserDao;
import learn.admin.user.domain.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final Environment env;

    private final UserDao userDao;

    private final UserMapper userMapper;

    @GetMapping("/")
    public String main(Model model) {

        List<User> users = userMapper.selectAll();

        if (users.isEmpty()) {
            userMapper.insert(new User("호랑나비", 137));
            users = userDao.selectAll();
        }

        model.addAttribute("user", users.get(0));
        model.addAttribute("appEnv", env.getProperty("app.env"));
        return "main";
    }
}

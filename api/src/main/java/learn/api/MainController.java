package learn.api;

import java.util.List;
import learn.api.user.domain.model.User;
import learn.api.user.domain.repository.UserDao;
import learn.api.user.domain.repository.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

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
        return "main";
    }
}

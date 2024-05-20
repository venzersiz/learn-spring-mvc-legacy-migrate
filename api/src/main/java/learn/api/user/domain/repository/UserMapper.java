package learn.api.user.domain.repository;

import java.util.List;
import learn.api.user.domain.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    void insert(User user);

    List<User> selectAll();
}

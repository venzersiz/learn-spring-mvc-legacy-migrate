package learn.admin.user.domain.repository;

import java.util.List;
import learn.admin.user.domain.model.User;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDao {

    private final SqlSession sqlSession;

    public User insert(User user) {

        sqlSession.insert("learn.api.user.domain.repository.UserMapper.insert", user);

        return user;
    }

    public List<User> selectAll() {
        return sqlSession.selectList("learn.api.user.domain.repository.UserMapper.selectAll");
    }
}

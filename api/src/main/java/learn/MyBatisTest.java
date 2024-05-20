package learn;

import java.io.IOException;
import java.io.InputStream;
import java.io.UncheckedIOException;
import java.util.List;
import learn.api.user.domain.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisTest {

    public static void main(String[] args) {

        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis/config.xml");

            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
                User user = new User("호랑나비", 137);
                sqlSession.insert("learn.api.user.domain.repository.UserMapper.insert", user);

                List<User> list = sqlSession.selectList("learn.user.domain.repository.UserMapper.selectAll");
                System.out.println(list);
            }
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

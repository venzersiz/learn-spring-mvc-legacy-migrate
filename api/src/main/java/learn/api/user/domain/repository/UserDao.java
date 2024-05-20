package learn.api.user.domain.repository;

import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends DaoSupport {

    @Override
    protected void initDao() throws Exception {
        super.initDao();
    }

    @Override
    protected void checkDaoConfig() throws IllegalArgumentException {
    }
}

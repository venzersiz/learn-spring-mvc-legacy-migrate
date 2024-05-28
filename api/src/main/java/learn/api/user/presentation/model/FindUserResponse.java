package learn.api.user.presentation.model;

import learn.api.user.domain.model.User;
import lombok.Getter;

@Getter
public class FindUserResponse {

    private User user;

    private String appEnv;

    public FindUserResponse(User user, String appEnv) {
        this.user = user;
        this.appEnv = appEnv;
    }
}

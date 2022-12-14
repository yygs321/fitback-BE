package fitback.fitbackBE.config.auth.dto;

import fitback.fitbackBE.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        //인증된 사용자 정보만 필요: name, email , picture 만 필드 선언
        this.name=user.getName();
        this.email=user.getEmail();
        this.picture=user.getPicture();
    }
}

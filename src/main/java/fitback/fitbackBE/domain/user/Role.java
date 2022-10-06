package fitback.fitbackBE.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role { //각 사용자 권한 관리할 enum 클래스

    //스프링 시큐리티 에서는 권한 코드에 항상 ROLE_ 이 앞에 있어야함
    GUEST("ROLE_GUEST", "학생/학부모"),
    USER("ROLE_USER", "강사");

    private final String key;
    private final String title;
}

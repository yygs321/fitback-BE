package fitback.fitbackBE.web;

import fitback.fitbackBE.config.auth.dto.SessionUser;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
public class indexController {

    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model){

        SessionUser user= (SessionUser) httpSession.getAttribute("user");
        //CustomOAuth2UserService 로그인 성공 시 세션에 SessionUser 저장하도록 구성
        //로그인 성공 시 httpSession.getAttribute("user") 실행 가능

        if (user!= null){ //세션에 저장된 값이 있을 때만 model에 userName 등록
            model.addAttribute("userName", user.getName());
        }
        return "index"; // 세션에 저장된 값 없을 경우 model엔 아무런 값이 없는 상태이므로 로그인 버튼 보임
    }
}

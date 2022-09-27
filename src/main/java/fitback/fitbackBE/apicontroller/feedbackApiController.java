package fitback.fitbackBE.apicontroller;

import com.sun.istack.NotNull;
import fitback.fitbackBE.domain.Feedback;
import fitback.fitbackBE.domain.PublishType;
import fitback.fitbackBE.domain.SessionType;
import fitback.fitbackBE.mapper.FeedbackMapper;
import fitback.fitbackBE.service.FeedbackService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/*피드백 작성
 * @Date 220925 @Author 정희윤
 * Dto: CreateFeedbackRequest(title 필수), CreateFeedbackResponse(id)
 * title 저장, write로 DB저장, id로 변경된 feedbackResponse 조회해 리턴
 */
@RestController
@RequestMapping("/v1/feedback")
@RequiredArgsConstructor
@Validated
public class feedbackApiController {
    private final  FeedbackService feedbackService;
    private final FeedbackMapper mapper;

    public feedbackApiController(FeedbackService feedbackService, FeedbackMapper mapper) {
        this.feedbackService = feedbackService;
        this.feedbackMapper = mapper;
    }


    @PostMapping
    public CreatedFeedbackResponse createFeedback(@RequestBody CreatedFeedbackRequest request){
        Feedback feedback = feedbackService.write(mapper.createRqToFeedBack(request));

        return new CreatedFeedbackResponse(id);
    }


    @Data
    public static class CreatedFeedbackRequest{//static으로 선언할지 고민중
        @NotNull
        private String title;
        private String contents;
        private SessionType sessionType;
        private PublishType publishType;
    }
    @Data
    public static class CreatedFeedbackResponse {//static으로 선언할지 고민중
        private Long id;
        public CreatedFeedbackResponse(Long id){ this.id = id;}
    }


}

package fitback.fitbackBE.apicontroller;

import com.sun.istack.NotNull;
import fitback.fitbackBE.domain.Feedback;
import fitback.fitbackBE.domain.PublishType;
import fitback.fitbackBE.domain.SessionType;
import fitback.fitbackBE.mapper.FeedbackMapper;
import fitback.fitbackBE.service.FeedbackService;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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


    @PostMapping
    public CreatedFeedbackResponse createFeedback(@RequestBody CreateFeedbackRequest request){
        Feedback feedback = feedbackService.write(mapper.mapCreateRqToFeedBack(request));

        return new CreatedFeedbackResponse(id);
    }

    @PatchMapping("/{feedback-id}")
    public ResponseEntity patchFeedback(@PathVariable("feedback-id")@Positive long id, PatchFeedbackRequest request){
        request.setFbId(id);
        Feedback feedback = feedbackService.upsateFeedback(mapper.mapPatchFbRqToFeedback(request));

    }

    @Data
    public static class CreateFeedbackRequest{
        @NotNull
        private String title;
        private String contents;
        private SessionType sessionType;
        private PublishType publishType;
    }
    @Data
    @Builder
    @Getter
    public static class CreatedFeedbackResponse {
        private Long id;

        public CreatedFeedbackResponse(Long id){ this.id = id;}
    }


    private class PatchFeedbackRequest {

    }
}

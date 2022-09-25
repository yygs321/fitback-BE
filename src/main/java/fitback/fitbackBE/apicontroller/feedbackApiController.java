package fitback.fitbackBE.apicontroller;

import fitback.fitbackBE.domain.Feedback;
import fitback.fitbackBE.service.FeedbackService;
import org.springframework.web.bind.annotation.*;

public class feedbackApiController {
    private final FeedbackService feedbackService;
    /*피드백 작성
    * @Date 220925 @Author 정희윤
    * Dto: CreateFeedbackRequest(title 필수), CreateFeedbackResponse(id)
    * title 저장, write로 DB저장, id로 변경된 feedbackResponse 조회해 리턴
    */
    @PostMapping("/v1/feedback")
    public CreatedFeedbackResponse createFeedback(@RequestBody CreatedFeedbackRequest request){
        Feedback feedback = new Feedback();
        feedback.setTitle(request.getTitle());
        Long id = feedbackService.write(feedback);
        return new CreatedFeedbackResponse(id);
    }



    public class CreatedFeedbackRequest{
        private String title;
    }
    private class CreatedFeedbackResponse {
        private Long id;
        public CreateFeedbackResponse(Long id){ this.id = id;}
    }


}

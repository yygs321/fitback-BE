package fitback.fitbackBE.mapper;

import fitback.fitbackBE.apicontroller.feedbackApiController;
import fitback.fitbackBE.domain.Feedback;

public interface FeedbackMapper {
    public Feedback createRqToFeedBack(feedbackApiController.CreatedFeedbackRequest request) {
    }
}

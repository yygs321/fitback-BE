package fitback.fitbackBE.mapper;

import fitback.fitbackBE.apicontroller.feedbackApiController;
import fitback.fitbackBE.domain.Feedback;

public interface FeedbackMapper {
    Feedback mapCreateRqToFeedBack(feedbackApiController.CreateFeedbackRequest createFbrequest);

    feedbackApiController.CreatedFeedbackResponse mapFbToCreatedRp(Feedback feedback);

    feedbackApiController.PatchedFbResponse mapFbToPatchFbResponse(Feedback feedback);

    Feedback mapPatchFbRqToFeedback(feedbackApiController.PatchFeedbackRequest request);

}

package fitback.fitbackBE.service;

import fitback.fitbackBE.domain.Feedback;

public class FeedbackService {
    public Long write(Feedback feedback) {
        feedbackRepository.save(feedback);
        return feedback.getId();
    }
}

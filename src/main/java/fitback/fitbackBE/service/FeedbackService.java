package fitback.fitbackBE.service;

import fitback.fitbackBE.domain.Feedback;
import fitback.fitbackBE.repository.FeedbackRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly=true)
public class FeedbackService {
    private final FeedbackRepository feedbackRepository;

    public Long write(Feedback feedback) {
        feedbackRepository.save(feedback);
        return feedback.getId();
    }

    public Feedback updateFeedback(Feedback feedback) {
        Optional.ofNullable(feedback.getTitle())
                .ifPresent(title-> feedback.setTitle(title));
        Optional.ofNullable(feedback.getContents())
                .ifPresent(contents-> feedback.setContents(contents));
        Optional.ofNullable(feedback.getSessionType())
                .ifPresent(sessionType-> feedback.setSessionType(sessionType));
        Optional.ofNullable(feedback.getPublishType())
                .ifPresent(publishType-> feedback.setPublishType(publishType));

        return feedbackRepository.save(feedback);
    }
}

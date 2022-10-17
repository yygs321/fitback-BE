package fitback.fitbackBE.repository;

import fitback.fitbackBE.domain.Feedback;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import  static org.assertj.core.api.Assertions.*;
@DataJpaTest
 class FeedbackRepositoryTest {
    @Autowired
    private FeedbackRepository feedbackRepository;

    @Test
    @DisplayName("FeedbackRepository null아님")
    void testFeedbackRepository() {
        assertThat(feedbackRepository).isNotNull();
    }

    @Test
    @DisplayName("피드백 생성 테스트")
    void testCreateFeedback(){
        //given 제목, 내용 적힌 객체 주어짐
       final Feedback feedback = feedback.builder()
               .contents("컨텐츠입니다")
               .title("제목입니다")
               .build();

        //when repository.save한 결과
       final Feedback result = feedbackRepository.save(feedback);

        //then 응답 id, 이름이 null 아님
       assertThat(result.getFbId()).isNotNull();//autoincrement로 생성되었는지 확인
       assertThat(result.getContents()).isEqualTo("컨텐츠입니다");
       assertThat(result.getTitle()).isEqualTo("제목입니다");

    }

}

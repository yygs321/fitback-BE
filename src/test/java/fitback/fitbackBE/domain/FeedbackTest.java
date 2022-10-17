package fitback.fitbackBE.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class FeedbackTest {
    @Test
    public void testFeedback() throws Exception {
        Feedback feedback = new Feedback();
    }
    /*수업회차를 조회하는 기능*/
    @Test
    @DisplayName("수업회차 조회기능")
    public void testGetClassRound() throws Exception{
        //Given
        int classRound =1;

        //When
        Feedback feedback = new Feedback(1);

        //then
        assertEquals(classRound,feedback.getClassRound());
    }

}
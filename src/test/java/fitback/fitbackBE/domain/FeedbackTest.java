/*
package fitback.fitbackBE.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.Assert.*;
import  static org.assertj.core.api.Assertions.*;

class FeedbackTest {
    @Test
     void testFeedback() throws Exception {
        Feedback feedback = new Feedback();
        assertNotNull(feedback,"null이 아니어야 합니다.");
    }

    @Test
    @DisplayName("수업회차 조회기능")
     void testGetClassRound() throws Exception{
        //Given
        int classRound =1;

        //When
        Feedback feedback = new Feedback(1);

        //then
//        assertEquals(classRound,feedback.getClassRound());
        assertThat(feedback.getClassRound()).as("check classRound").isEqualTo(classRound);
    }

}*/

package fitback.fitbackBE.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table
@Getter
@Builder
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long fbId;
    private int classRound;
    private String contents;
    private String title;

/*    public Feedback(int classRound) {
        this.classRound =classRound;
    }

    public int getClassRound() {
        return this.classRound;
    }*/


}

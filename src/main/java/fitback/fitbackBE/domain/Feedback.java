package fitback.fitbackBE.domain;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Feedback {
    private int classRound;
    public Feedback(int classRound) {
        this.classRound =classRound;
    }

    public int getClassRound() {
        return this.classRound;
    }
}

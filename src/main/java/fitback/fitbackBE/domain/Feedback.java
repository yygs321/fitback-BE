package fitback.fitbackBE.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;


@Getter @Setter
@Entity
@Table(name="feedback")
@RequiredArgsConstructor
public class Feedback {

    @Id
    @GeneratedValue
    @Column(name="feedback_id")
    private Long id;

//    @ManyToOne(fetch = LAZY)
//    @JoinColumn(name="user_id")
//    private User user;
    @Column(length = 50, nullable = false)
    private String title;

    @Column
    private String contents;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false)
    private SessionType sessionType = SessionType.REGULAR;//수업 상태 [REGULAR, ABSENT, EXTRA]

    private LocalDate createdTime;//작성시간

    @Enumerated(EnumType.STRING)
    private PublishType publishType;//OPEN,HIDE


}

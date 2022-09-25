package fitback.fitbackBE.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
@Getter
@Setter
public class Feedback {
    @Id
    private Long id;
    private String title;
    private String contents;
    private SessionType sessionType;//REGULAR, EXTRA
    private LocalDate createdTime;
    private PublishType publishType;//OPEN,HIDE


}

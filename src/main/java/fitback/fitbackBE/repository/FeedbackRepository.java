package fitback.fitbackBE.repository;

import fitback.fitbackBE.domain.Feedback;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
@Repository
@RequiredArgsConstructor
public interface FeedbackRepository extends JpaRepository {
    private final EntityManager em;
    public void save(Feedback feedback){em.persist(feedback);}

}

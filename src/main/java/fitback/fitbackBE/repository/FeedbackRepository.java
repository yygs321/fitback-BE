package fitback.fitbackBE.repository;

import fitback.fitbackBE.domain.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
@Repository
public interface FeedbackRepository extends JpaRepository<T, ID> {
    private final EntityManager em;
    public Feedback save(Feedback feedback){em.persist(feedback);}

}

package web.mundodanime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.mundodanime.entity.Episode;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, Long> {
}

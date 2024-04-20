package web.mundodanime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.mundodanime.entity.Anime;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long> {

    Anime findByName(String name);

}

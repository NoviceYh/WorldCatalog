package web.mundodanime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.mundodanime.entity.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {
}

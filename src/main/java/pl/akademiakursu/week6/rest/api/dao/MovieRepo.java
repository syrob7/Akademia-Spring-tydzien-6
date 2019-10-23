package pl.akademiakursu.week6.rest.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.akademiakursu.week6.rest.api.dao.entity.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Long> {
}

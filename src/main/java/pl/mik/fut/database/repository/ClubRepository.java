package pl.mik.fut.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mik.fut.database.entity.Club;

public interface ClubRepository extends JpaRepository<Club, Long> {
}

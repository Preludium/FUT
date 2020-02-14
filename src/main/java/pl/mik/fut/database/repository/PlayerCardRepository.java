package pl.mik.fut.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mik.fut.database.entity.PlayerCard;

public interface PlayerCardRepository extends JpaRepository<PlayerCard, Long> {
}

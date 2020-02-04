package pl.mik.fut.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mik.fut.database.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

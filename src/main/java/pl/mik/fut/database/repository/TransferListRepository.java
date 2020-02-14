package pl.mik.fut.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mik.fut.database.entity.TransferList;

public interface TransferListRepository extends JpaRepository<TransferList, Long> {
}

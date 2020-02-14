package pl.mik.fut.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mik.fut.database.entity.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}

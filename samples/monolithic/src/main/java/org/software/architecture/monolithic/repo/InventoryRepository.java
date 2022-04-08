package org.software.architecture.monolithic.repo;

import org.software.architecture.monolithic.domain.Inventory;
import org.software.architecture.monolithic.domain.InventoryId;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, InventoryId> {
}

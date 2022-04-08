package org.software.architecture.monolithic.repo;

import org.software.architecture.monolithic.domain.Warehouse;
import org.springframework.data.repository.CrudRepository;

public interface WarehouseRepository extends CrudRepository<Warehouse,Long> {
}

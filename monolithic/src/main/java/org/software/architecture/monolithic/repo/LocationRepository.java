package org.software.architecture.monolithic.repo;

import org.software.architecture.monolithic.domain.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location,Long> {
}

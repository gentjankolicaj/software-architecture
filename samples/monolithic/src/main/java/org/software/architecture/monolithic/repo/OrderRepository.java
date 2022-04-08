package org.software.architecture.monolithic.repo;

import org.software.architecture.monolithic.domain.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Long> {
}

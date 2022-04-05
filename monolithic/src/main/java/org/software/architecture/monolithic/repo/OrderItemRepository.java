package org.software.architecture.monolithic.repo;

import org.software.architecture.monolithic.domain.OderItemId;
import org.software.architecture.monolithic.domain.OrderItem;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItem, OderItemId> {
}

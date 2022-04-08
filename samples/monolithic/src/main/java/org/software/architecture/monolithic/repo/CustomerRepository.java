package org.software.architecture.monolithic.repo;

import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<CustomerRepository,Long> {
}

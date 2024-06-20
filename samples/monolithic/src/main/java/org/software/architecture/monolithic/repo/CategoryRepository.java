package org.software.architecture.monolithic.repo;

import org.software.architecture.monolithic.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,String> {
}

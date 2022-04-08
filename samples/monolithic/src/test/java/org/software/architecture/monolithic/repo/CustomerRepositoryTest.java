package org.software.architecture.monolithic.repo;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;


@SpringBootTest
@Transactional(transactionManager = "transactionManager")
class CustomerRepositoryTest {

}
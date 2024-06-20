package org.software.architecture.monolithic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class MonolithicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonolithicApplication.class, args);
	}

}

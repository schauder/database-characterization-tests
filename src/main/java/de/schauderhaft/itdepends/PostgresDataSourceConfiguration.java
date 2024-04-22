package de.schauderhaft.itdepends;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.PostgreSQLContainer;

@Configuration
public class PostgresDataSourceConfiguration {

	@Bean
	Database postgres() {

		PostgreSQLContainer<?> container = new PostgreSQLContainer<>("postgres:16.2");
		container.start();

		PGSimpleDataSource dataSource = new PGSimpleDataSource();
		dataSource.setUrl(container.getJdbcUrl());
		dataSource.setUser(container.getUsername());
		dataSource.setPassword(container.getPassword());
		return new Database("PostgreSQL", "16.2", dataSource);
	}
}


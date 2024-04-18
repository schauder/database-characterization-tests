package de.schauderhaft.itdepends;

import org.postgresql.ds.PGSimpleDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.PostgreSQLContainer;

import javax.sql.DataSource;

@Configuration
public class PostgresDataSourceConfiguration {

	@Bean
	DataSource dataSource() {

		PostgreSQLContainer<?> container = new PostgreSQLContainer<>("postgres:16.2");
		container.start();

		PGSimpleDataSource dataSource = new PGSimpleDataSource();
		System.out.println(container.getJdbcUrl());
		dataSource.setUrl(container.getJdbcUrl());
		dataSource.setUser(container.getUsername());
		dataSource.setPassword(container.getPassword());
		return dataSource;
	}
}


package de.schauderhaft.itdepends;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.testcontainers.containers.MySQLContainer;

@Configuration
public class MySqlDataSourceConfiguration {

	@Bean
	Database mysql() {

		MySQLContainer<?> container = new MySQLContainer<>("mysql:8.3.0");
		container.start();

		MysqlDataSource dataSource = new MysqlDataSource();
		dataSource.setUrl(container.getJdbcUrl());
		dataSource.setUser(container.getUsername());
		dataSource.setPassword(container.getPassword());
		return new Database("MySQL", "8.3.0", dataSource);
	}
}


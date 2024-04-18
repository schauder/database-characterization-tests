package de.schauderhaft.itdepends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Autowired
	List<Scenario> scenarios;

	@Autowired
	List<DataSource> dataSources;

	@Override
	public void run(String... args) {

		for (DataSource dataSource : dataSources) {
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			for (Scenario scenario : scenarios) {
				scenario.run(jdbcTemplate);
			}
		}
	}
}

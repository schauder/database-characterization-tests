package de.schauderhaft.itdepends;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public interface Scenario {
	default void run(Database database) {
		run(new JdbcTemplate(database.datasource()));
	}
	void run(JdbcTemplate template);
}

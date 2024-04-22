package de.schauderhaft.itdepends;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public interface Scenario {
	void run(Database database);
}

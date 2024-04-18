package de.schauderhaft.itdepends;

import org.springframework.jdbc.core.JdbcTemplate;

public interface Scenario {
	void run(JdbcTemplate dataSource);
}

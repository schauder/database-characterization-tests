package de.schauderhaft.itdepends;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
class SelectWithoutTable implements Scenario{
	@Override
	public void run(JdbcTemplate jdbcTemplate) {
		jdbcTemplate.execute("select 1");
	}
}

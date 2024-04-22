package de.schauderhaft.itdepends;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
class OrderByNullable implements Scenario{
	@Override
	public void run(JdbcTemplate jdbcTemplate) {
		System.out.println("Order by Nullable");
	}
}

package de.schauderhaft.itdepends;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public record Database(String name, String version, DataSource datasource, JdbcOperations template) {
	public Database(String name, String version, DataSource datasource) {
		this(name, version, datasource, new JdbcTemplate(datasource));

	}

}

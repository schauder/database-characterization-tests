package de.schauderhaft.itdepends;

import javax.sql.DataSource;

record Database (String name, String version, DataSource datasource) {
}

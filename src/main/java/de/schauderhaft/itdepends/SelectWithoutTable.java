package de.schauderhaft.itdepends;

import org.springframework.stereotype.Component;

@Component
class SelectWithoutTable extends ScenarioTemplate {

	public SelectWithoutTable(EventDispatcher eventDispatcher) {
		super("Select Without Table", eventDispatcher);
	}

	@Override
	protected Object execute(Database database) {
		database.template().execute("select 1");
		return "";
	}

}

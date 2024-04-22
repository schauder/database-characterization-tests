package de.schauderhaft.itdepends;

import org.springframework.stereotype.Component;

@Component
class OrderByNullable extends ScenarioTemplate {
	public OrderByNullable(EventDispatcher eventDispatcher) {
		super("Order By Null", eventDispatcher);
	}

	@Override
	protected Object execute(Database database) {
		System.out.println("Order by Nullable");
		return "";
	}
}

package de.schauderhaft.itdepends;

public abstract class ScenarioTemplate implements Scenario {
	private final String name;
	private final EventDispatcher eventDispatcher;

	public ScenarioTemplate(String name, EventDispatcher eventDispatcher) {
		this.name = name;
		this.eventDispatcher = eventDispatcher;
	}

	public void run(Database database) {

		eventDispatcher.report(EventType.START, this, database, "");
		Object result = setup(database);
		eventDispatcher.report(EventType.SETUP, this, database, result);
		result = execute(database);
		eventDispatcher.report(EventType.SUCCESS, this, database, result);
		result = cleanup(database);
		eventDispatcher.report(EventType.CLEANUP, this, database, result);
	}

	protected Object setup(Database database){return "";}
	protected Object execute(Database database){return "";}
	protected Object cleanup(Database database){return "";}

}

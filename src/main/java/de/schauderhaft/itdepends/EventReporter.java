package de.schauderhaft.itdepends;

public interface EventReporter {
	void report(EventType eventType, Scenario source, Database database, Object content);
}

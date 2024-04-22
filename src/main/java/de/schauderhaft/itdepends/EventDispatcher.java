package de.schauderhaft.itdepends;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventDispatcher {

	private final List<EventReporter> reporters;

	public EventDispatcher(List<EventReporter> reporters) {
		this.reporters = reporters;

	}


	public void report(EventType eventType, Scenario source, Database database, Object content) {
		for (EventReporter reporter : reporters) {
			reporter.report(eventType, source, database, content);
		}

	}
}

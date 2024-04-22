package de.schauderhaft.itdepends;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LoggingReporter implements EventReporter {

	private static final Logger log = LoggerFactory.getLogger(LoggingReporter.class);

	@Override
	public void report(EventType eventType, Scenario source, Database database, Object content) {
		log.info(eventType + "\t" + source + "\t" + database.name() + ":" + database.version() + "\t" + content);

	}
}

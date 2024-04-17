package de.schauderhaft.itdepends;

import org.springframework.stereotype.Component;

@Component
class SelectWithoutTable implements Scenario{
	@Override
	public void run() {
		System.out.println("select without table");
	}
}

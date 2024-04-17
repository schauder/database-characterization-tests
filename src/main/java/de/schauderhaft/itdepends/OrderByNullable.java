package de.schauderhaft.itdepends;

import org.springframework.stereotype.Component;

@Component
class OrderByNullable implements Scenario{
	@Override
	public void run() {
		System.out.println("Order by Nullable");
	}
}

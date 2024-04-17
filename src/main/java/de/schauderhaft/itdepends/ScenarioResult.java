package de.schauderhaft.itdepends;

record ScenarioResult(
		ResultType resultType,
		String info) {
}

enum ResultType {
	UNEXPECTED_FAILURE,
	UNSUPPORTED,
	SUPPORTED
}

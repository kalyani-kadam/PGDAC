package p1;

interface Formula {
	int DATA=100;//public static final
	double calculate(double a);// public n abstract : added implicitly by javac

	// public : added implicitly by javac
	default double sqrt(double a, double b) {
		return Math.sqrt(a + b);
	}
}

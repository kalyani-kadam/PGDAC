package p3;

public interface ComputationUtils {
//add a static method to perform ANY operation on given 2 double operands
	//higher order function/method : Any method which accepts the behavior
	//using a func i/f (lambda expression)
	static double computeAnyOperation(double a,double b,
			DoubleComputable operation)
	{
		return operation.anyOperation(a, b);
	}
}

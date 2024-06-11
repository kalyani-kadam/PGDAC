package p3;
import static p3.ComputationUtils.computeAnyOperation;

public class Tester {

	public static void main(String[] args) {
		// add 2 doubles , n print the result.
		 System.out.println(computeAnyOperation(10, 20,new Adder()));
		 //multiply 2 double n print the result
		 System.out.println(computeAnyOperation(11, 23.45, new DoubleComputable() {
			
			@Override
			public double anyOperation(double d1, double d2) {
				// TODO Auto-generated method stub
				return d1*d2;
			}
		}));
		 //OR use lambda expression (FP) to divide 2 doubles
		 
		 System.out.println(computeAnyOperation(23, 4.5,
				 ( a, b) ->  a/b));
		 
	}

}

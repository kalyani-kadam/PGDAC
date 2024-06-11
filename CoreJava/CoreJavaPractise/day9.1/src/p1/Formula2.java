package p1;

public class Formula2 implements Formula{
	//MUST imple inherited abstract method
	@Override
	public double calculate(double a) {
		// TODO Auto-generated method stub
		return a*5;
	}
	//Can imple class override the inherited  def . method

	@Override
	public double sqrt(double a, double b) {		
		return Math.sqrt(a-b);
	}
	

	
}

package p2;

public class C implements A,B{

	@Override
	public void show() {
		//A'show 
		A.super.show();
		B.super.show();
		System.out.println("more B.L here....");
	}
	
}

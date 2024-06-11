package p2;

//public class C implements A,B{
////this will cause error javac err
////	Duplicate default methods named show with the parameters () and () are inherited from the types B and A
//}

public class C implements A,B{

	@Override
	public void show() {
		//A'show 
//		A.super.show();
		B.super.show();
		System.out.println("more B.L here....");
	}
}
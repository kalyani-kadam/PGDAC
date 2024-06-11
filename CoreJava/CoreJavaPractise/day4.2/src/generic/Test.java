package generic;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		// create Holder class instance to hold int value : 12345
		Holder<Integer> intHolder=new Holder<>(12345);//int --> Integer : auto boxing
		int data=intHolder.getRef();//auto un boxing : no need of expl down casting
		// create Holder class instance to hold String : "testing"
		Holder<String> stringHolder=new Holder<>("testing");//NO conversion !!!!
		String s=stringHolder.getRef();
	//	intHolder=stringHolder;//javac err : incompatible types
		//intHolder : Holder<Integer>
		//stringHolder : Holder<String>
		Holder<LocalDate> dateHolder=new Holder<>(LocalDate.now());
		System.out.println(dateHolder.getRef());
		
		
		
	}

}

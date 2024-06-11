package non_generic;

public class Test {

	public static void main(String[] args) {
		// create Holder class instance to hold int value : 12345
		Holder intHolder=new Holder(12345);//auto boxing--> up casting
		System.out.println(intHolder.getClass());//non_generic.Holder
		System.out.println(intHolder.getRef().getClass());//java.lang.Integer
		int data=(int)intHolder.getRef();//dis adv : any time you want access data : explicit down casting is required
		System.out.println(data);

		// create Holder class instance to hold String : "testing"
		Holder stringHolder=new Holder("testing");//up casting
		System.out.println(stringHolder.getClass());//non_generic.Holder
		System.out.println(stringHolder.getRef().getClass());//java.lang.String
		String s=(String)stringHolder.getRef();//dis adv : any time you want to access data : explicit down casting is required
		intHolder=stringHolder;//for javac : data type : Holder
		data=(int)intHolder.getRef();//ClassCastException : String can't be cast Integer!!!
		System.out.println(data);
	}

}

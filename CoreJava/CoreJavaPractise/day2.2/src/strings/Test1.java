package strings;
//immutability of strings 
public class Test1 {

	public static void main(String[] args) {
		String s1=new String("hello");
		s1.concat("students !");
		System.out.println(s1);//hello
		s1 += " hi there !!!!";//s1=s1+"hi there"
		System.out.println(s1);//hello hi there 
		System.out.println(s1.toUpperCase());//upper cased
		System.out.println(s1);//lower case
		String s2=s1.substring(0,5);
		System.out.println(s1);//hello hi there !!!!
		System.out.println(s2);//hello
		s2=s1.replace('h', 'f');
		System.out.println(s1);//orig
		System.out.println(s2);//replaced

	}

}

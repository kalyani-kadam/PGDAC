package strings;

import java.util.Date;

public class Test4 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("hello");
		System.out.println(sb1.length() + " " + sb1.capacity());// 5 21
		StringBuilder sb2 = sb1.append("123.456");
		System.out.println(sb1);// hello 123.456
		System.out.println(sb2);// hello 123.456
		System.out.println(sb1 == sb2);// t
		sb1.append(true).
		append(8888).
		append(45.67F).
		append(new Date());
		System.out.println(sb1);//hello123.456true888845.67Sat Apr 27 12:52:48 IST 2024
		sb1.insert(0, new char[] {'a','b','c','d'}, 0, 4);
		System.out.println(sb1);
		System.out.println(sb1.length()+"  "+sb1.capacity());
		//delete chars
		sb1.delete(0,sb1.length());
		System.out.println("after delete "+sb1);
		System.out.println(sb1.length() + " " + sb1.capacity());//0 curnt
		sb1.trimToSize();
		System.out.println(sb1.length() + " " + sb1.capacity());//0 0
		


	}

}

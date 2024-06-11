package test_generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class test {
	public static void main(String[] args) {
		List<? extends Fruit> fruits=new ArrayList<Fruit>();
		List<? extends Fruit> fruits1=new ArrayList<Melon>();  //legal
		List<? extends Fruit> fruits2=new LinkedList<Watermelon>(); //legal
//		List<? extends Fruit> fruits3=new Vector<Object>();  //illegal
		List<? super Melon> melons4=new ArrayList<Fruit>();  //legal
		List<? super Melon> melons5=new LinkedList<>();     //legal
//		List<? super Melon> melons6=new LinkedList<WaterMelon>();  //illegal
		
		List<Melon> melons=new ArrayList<>();
		HashSet<Fruit> fruits4=new HashSet<>();
		LinkedList<Watermelon> wMelons=new LinkedList<>();
//		melons.addAll(fruits);  //illegal
		melons.addAll(wMelons); //legal
//		fruits.addAll(melons); //legal
//		fruits.addAll(wMelons); //legal
//		wMelons.addAll(fruits); //illegal
//		wMelons.addAll(melons);  //illegal
	}
}

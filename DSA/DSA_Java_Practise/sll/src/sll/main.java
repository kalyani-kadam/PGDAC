package sll;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL s=new SLL();
		s.insert(12);
		s.insert(92);
		s.insert(192, 1);
		s.insert(44);
		s.insert(67);
		s.insert(244, 3);
		s.insert(123);
		s.insert(44);
		s.insert(67);
		s.insert(190, 0);
		System.out.println("after insertion");
		s.display();
		System.out.println("after deletion");
		s.delete(192);
		s.display();
//		System.out.println("after deletion");
//		s.delete(244, 1);
//		s.display();
		System.out.println("after deletion");
//		s.delete(44, 3);
//		s.delete(790);
//		s.display();
		
		s.deletebypos(3);
		s.display();
		System.out.println("Remove duplicates");
		s.removeDuplicates();
		s.display();
		
		s.searchByVal(67);
		System.out.println("------ASC SORT------");
		s.sortAsc();
		s.display();
		System.out.println("------DESC SORT------");
		s.sortDesc();
		s.display();
		System.out.println("----Min---------");
		s.getMin();
		System.out.println("----Max---------");
		s.getMax();
	}
}

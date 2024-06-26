import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BinarySearchArray bs = new BinarySearchArray();
		int arr[] = bs.addElemnts(sc);
		bs.display(arr);
		int [] sortarr = bs.sortArr(arr);
		bs.display(sortarr);
		System.out.println("enter element to search");
		bs.search(sortarr, sc.nextInt());
		
	}

}

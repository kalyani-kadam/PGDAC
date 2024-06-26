import java.util.Scanner;

public class BinarySearchArray{

	public int[] addElemnts(Scanner sc) {
//		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size");
		int s = sc.nextInt();
//		BinarySearchArray bsa =new BinarySearchArray(sc.nextInt());
		int arr[] = new int[s];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter array element");
			int data = sc.nextInt();
			boolean checkDup = checkDuplicate(arr, data);
			if(checkDup == true) {
				System.out.println("Duplicate element entered");
				System.out.println();
				i--;
				continue;
//				int elmnt = sc.nextInt();
			}else {
				arr[i] = data;
			}  	
		}
		return arr;
		
	}
	public boolean checkDuplicate(int []arr,int data) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == data) {
				return true;
			}
		}
		return false;
	}
	
	public void display(int []arr) {
		System.out.println("Entered array elements are : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
//	public int[] sortArr(int [] arr) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i] > arr[j]) {
//					int temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
//		return arr;
//}
		public int[] sortArr(int [] arr) {	
		//using bubble sort
		int pas = arr.length-1,comp = arr.length-1;
		for(int i=0;i<pas;i++) {
			for(int j=0;j<comp-i;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public int search(int []arr,int key) {
		int low = 0,high=arr.length-1;
		while(low<=high) {
			int mid = (low + high)/2;
			if(arr[mid] == key) {
				System.out.println(arr[mid]+" found at index "+mid);
				return mid;
			}
			if(key < arr[mid]) {
				high = mid-1;
			}
			else {
				low = mid+1;
			}
		}
		System.out.println("Element not found");
		return -1;	
	}
}
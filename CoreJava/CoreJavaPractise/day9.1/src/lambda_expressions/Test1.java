package lambda_expressions;

import java.util.List;

public class Test1 {

	public static void main(String[] args) {		
		List<Integer> intList=List.of(12,3,4,5,7,10);
		//display all the elems from the Integer list
		/*Is List , Iterable ? YES
		 * It's method
		 * public default void forEach(Consumer<? super T> action)
		 * Consumer : func i/f can it be replaced by a lambda expr : YES
		 * SAM : public void accept(T o)
		 */
		
		intList.forEach(i -> System.out.println(i));
		

	}

}

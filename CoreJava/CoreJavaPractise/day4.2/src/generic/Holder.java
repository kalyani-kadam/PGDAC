package generic;
//T : type (can be replaced by any reference type n NOT by primitive types)
//generic class => parameterized type
public class Holder<T> {
//state 
	private T ref;

	public Holder(T ref) {
		super();
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}
	
}

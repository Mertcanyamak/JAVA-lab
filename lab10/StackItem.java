public class StackItem <T>{

	
	private T obj;
	private StackItem<T> previous;
	
	public StackItem(T obj,StackItem<T> previous ) {
		this.obj=obj;
		this.previous= previous;
	}

	public T getItem() {
		return obj;
	}

	public StackItem<T> getPrevious() {
		return previous;
	}
}

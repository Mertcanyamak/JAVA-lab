import java.util.ArrayList;
import java.util.List;

public class StackImpl <T> implements Stack<T> {
  
	StackItem<T> top;
	
	@Override
	public void push(T item) {
		StackItem<T> newTop= new StackItem<>(item, top);
		top =  newTop;
	}

	@Override		// TODO Auto-generated method stub

	public T pop() {
		T  item = top.getItem();
		
	  top = top.getPrevious();
			  return item;
	}

	@Override
	public boolean empty() {
	
		return top == null;
	}

	@Override
	public List<T> toList() {
		StackItem<T> current = top;
		ArrayList<T> items = new ArrayList<T>();
		while (current != null) {
			items.add(0, current.getItem());
			current = current.getPrevious();
		}
		return items;
	}

}

import java.util.ArrayList;
public class Test {

	public static <T> void main(String[] args) {
        StackArrayListImpl<String> stack1 = new StackArrayListImpl<String>();
        stack1.push("A");
        stack1.push("B");
       StackImpl<String> stack =  new StackImpl<String>();		
		
		stack.push("Hello");
		stack.push("ABC");
		Object obj = stack1.pop();
		System.out.println(obj);
		
		System.out.println(stack.toList());
	}

}

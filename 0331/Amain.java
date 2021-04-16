package week5;

public class Amain {
	public static void main(String[] args) {
		ArrayStack02<String> stack = new ArrayStack02<String>();
		
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
 	}
}

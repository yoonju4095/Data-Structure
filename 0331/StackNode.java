package week5;

interface Stack{
			boolean isEmpty();
			void push(char item);
			char pop();
			void delete();
			char peek();
}

public class StackNode {
			char data;
			StackNode link;
}

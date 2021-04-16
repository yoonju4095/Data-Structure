package week5;

interface Stack{
		boolean isEmpty( );
		void push(char item);
		char pop( );
		void delete( );
		char peek( );
}

public class ArrayStack01 {
				private int top;
				private int stackSize;
				private char itemArray[];
				
				public ArrayStack01(int stackSize) {
					top = -1;
					this.stackSize = stackSize;
					itemArray = new char[this.stackSize];
					}
				public boolean isEmpty(){
					return (top == -1);
					}

				public boolean isFull(){
								return (top == this.stackSize-1);
								}
				
				public void push(char item){
								if(isFull()){
									System.out.println("Inserting fail! Array Stack is full!!");
								}
								else{
									itemArray[++top] = item;
									System.out.println("Inserted Item : " + item);
								}
								}
				public char pop(){
								if(isEmpty()) {
									System.out.println("Deleting fail! Array Stack is empty!!");
									return 0;
								}
								else{
								return itemArray[top--];
								}
								}
					
					public void delete(){
								if(isEmpty()){
									System.out.println("Deleting fail! Array Stack is empty!!");
								}
								else {
									top--;
								}
								}
					public char peek(){
								if(isEmpty()){
									System.out.println("Peeking fail! Array Stack is empty!!");
									return 0;
								}
								else
								return itemArray[top];
								}
						
					public void printStack(){
								if(isEmpty())
									System.out.printf("Array Stack is empty!! %n %n");
								else{
									System.out.printf("Array Stack>> ");
									for(int i=0; i<=top; i++)
									System.out.printf("%c ", itemArray[i]);
									System.out.println(); System.out.println();
								}
								}

}

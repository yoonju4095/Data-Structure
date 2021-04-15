class DQNode {
	char data;
	DQNode rlink;
	DQNode llink;
}

class DQueue {
	   DQNode front;
	   DQNode rear;

	   public DQueue() {
	      front = null;
	      rear = null;
	   }

	   public boolean isEmpty() {
	      return (front == null);
	   }

	   public void insertFront(char item) {
	      DQNode newNode = new DQNode();
	      newNode.data = item;
	      if (isEmpty()) {
	         front = newNode;
	         rear = newNode;
	         newNode.rlink = null;
	         newNode.llink = null;
	      } else {
	         front.llink = newNode;
	         newNode.rlink = front;
	         newNode.llink = null;
	         front = newNode;
	      }
	      System.out.println("Front Inserted Item : " + item);
	   }

	   public void insertRear(char item) {
	      DQNode newNode = new DQNode();
	      newNode.data = item;
	      if (isEmpty()) {
	         front = newNode;
	         rear = newNode;
	         newNode.rlink = null;
	         newNode.llink = null;
	      } else {
	         front.llink = newNode;
	         newNode.rlink = front;
	         newNode.llink = null;
	         front = newNode;
	      }
	      System.out.println("Rear Inserted Item : " + item);
	   }

	   public void removeFront() {
	      if (isEmpty()) {
	         System.out.println("Front Removing fail! DQueu is empty!");
	      } else {
	         if (front.rlink == null) {
	            front = null;
	            rear = null;
	         } else {
	            front = front.rlink;
	            front.llink = null;
	         }
	      }
	   }
	}
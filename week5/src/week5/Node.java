package week5;

public class Node <E>{
	private E item;
	private Node next;
	
	public Node(E newItem, Node p){ // ������
	item = newItem;
	next = p;
}
	// get �޼ҵ�� set �޼ҵ�
	public E getItem() { return item;}
	public Node getNext() { return next;}
	public void setItem(E newItem) { item = newItem;}
	public void setNext(Node newNext) { next = newNext;}
}
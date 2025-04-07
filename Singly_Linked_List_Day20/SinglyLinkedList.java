package Singly_Linked_List_Day20;

public class SinglyLinkedList {
	Node head;
	Node tail;
	static int count;
	
	public void insert(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			count++;
		}
		else {
			tail.next = node;
			tail = node;
			count++;
		}
		
	}
	public void display() {
		Node current  = head;
		if(current == null) {
			System.out.println("The Linked list is empty");
		}
		else {
			System.out.println("Nodes in the Linked List are:");
			while(current != null) {
				System.out.println(current.data);
				if(current.next != null) {
					System.out.println("->");
					
				}
				current = current.next;
			}
		}
	}
	public void update(int position, int newdata) {
		
		if(head==null) {
			return;
		}
		else if(position == 1) {
			head.data = newdata;
		}
		else if(position == count) {
			tail.data = newdata;
		}
		else if(position <1 || position > count) {
			System.err.println("Position out of bound");
			
		}
		else {
			Node current = head;
			for(int i = 1; i <= count; i++) {
				if(position == i) {
					current.data = newdata;
					return;
				}
				current = current.next;
			}
		}
	}
	public void insertAt(int position, int newdata) {
		Node node = new Node(newdata);
		if(head == null) {
			
			head = node;
			tail = node;
			count++;
			return;
		}
		if (position == 1) {
			node.next = head;
			head = node;
			count++;
			return;
		}
		Node current = head;
	    for (int i = 1; i <= count; i++) {
			if (i == position-1) {
				node.next = current.next;
				current.next = node;
				count++;
				return;
			}
			current = current.next;
		}
	}
	public void deleteAt(int position) {
		if(head == null) {
			System.out.println("No element to delete");
			return;
		}
		if(position == 1) {
			Node temp = head;
			head = head.next;
			temp.next = null;
			count--;
			return;
		}
		Node current = head;
		if(position == count) {
			for(int i = 1; i <= count; i++) {
				if(i == position - 1) {
					current.next = null;
					count--;
					return;
				}
				current = current.next;
			}
		}
		for(int i = 1; i <= count; i++) {
			if(i == position-1) {
				Node temp = current;
				current = current.next;
				temp.next = current.next;
				current.next = null;
				count--;
				
			}
			current = current.next;
		}
		
	}
}

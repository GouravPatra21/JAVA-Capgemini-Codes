package Stack_usingLinkedList_Day22;

public class Stack {
	private Node top;
    private int size;
    
    public Stack() {
        this.top = null;
        this.size = 0;
    }
    
    // Push operation: Add an element to the top of the stack
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }
    
    // Pop operation: Remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }
    
    // Peek operation: Return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }
    
    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }
    
    // Get the size of the stack
    public int size() {
        return size;
    }
    
    // Display the stack contents
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.print("Stack (top to bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    

}

package Stack_usingArray_Day22;

public class Stack {
	int[] stackArray;
	int top;
	int maxsize;
	public Stack(int size) {
		this.maxsize = size;
		this.top = -1;
		this.stackArray = new int[maxsize];
	}
	public void push(int value) {
		if(top == maxsize - 1) {
			System.out.println("Stack Overflows");
			return;
		}
		else {
			stackArray[++top] = value;
			System.out.println(value + " Pushed into Stack");
		}
	}
	public int pop() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else {
			int value = stackArray[top--];
			System.out.println(value + "Popped from Stack");
			return value;
		}
	}
	public int peek() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return -1;
		}
		else {
			return stackArray[top];
		}
	}
	public void display() {
		if(top == -1) {
			System.out.println("Stack is Empty");
			return ;
		}
		else {
			System.out.println("Stack from Top to Bottom");
			for(int i = top; i >= 0; i--) {
				System.out.println(stackArray[i] + " ");
			}
			System.out.println();
		}
	}
	

}

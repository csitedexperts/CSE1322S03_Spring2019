package queueImplementation;

class Node {
	int id;
	String name;
	Node next; 

	public Node(int id, String name){
		this.id = id;
		this.name = name;
	}

	public void displayANode(){
		System.out.println("id: " + id + " name:" + name );
	}

	@Override
	public String toString(){   // Required
		return  name + " and " + id;
	}

}  // End of the Node class

class Queue {
	Node front;
	Node rear;

	Queue(){   // Optional 
		front = null;  // null initialization
		rear = null;  // null initialization
		// Here to show the head and tail always start as null
	}

	public boolean isEmpty() {
		return (front == null);
	}

	public void peek() {
		if(isEmpty())
			System.out.println("There is nothing to peek");
		else {
			System.out.println("The front node's id is : " + front.id);
		}
	}

	public void enQueue(int id, String name) {
		Node node = new Node(id, name);
		if (rear == null) {
			front = node;
			rear = node;
		}
		else {
			rear.next = node;
			rear = node;
		}
	}
	public void deQueue() {
		if (front == null) {
			rear = null;
			System.out.println("There is no node to delete" );
			return;
		}
		else {
			int id = front.id;
			String name = front.name;
			System.out.println("The node with Id: " + id + " and Name: "+ name + "  is deleted " );
			front = front.next;
		}
	}


	public void displayAllNodes(){

		Node thisNode = front;

		while(thisNode != null){
			thisNode.displayANode();
			System.out.println("Next Node: " + thisNode.next);
			thisNode = thisNode.next;
			System.out.println();
		}

	}

}  // end of the Queue Class


public class QueueImplementationExplained {

	public static void main(String[] args) {

		System.out.println("Queue Implementation Explained ....... ");

		Queue myq = new Queue();

		myq.enQueue(1, "A");
		System.out.println("myq.front = " + myq.front);
		System.out.println("myq.rear = " + myq.rear);

		System.out.println("myq.front.next = " + myq.front.next);
		System.out.println("myq.rear.next = " + myq.rear.next);

		System.out.println("= = = = =  = = = = = = = = = = = = = = ");
				
		myq.enQueue(2, "B");

		System.out.println("myq.front = " + myq.front);
		System.out.println("myq.rear = " + myq.rear);

		System.out.println("myq.front.next = " + myq.front.next);
		System.out.println("myq.rear.next = " + myq.rear.next);
		myq.deQueue();
		myq.peek();
		System.out.println("********************* = ");
			
		myq.displayAllNodes();
		System.out.println("********************* = ");
		
		
		myq.enQueue(3, "C");
		myq.enQueue(4, "D");
		myq.displayAllNodes();
		
		myq.deQueue();
		myq.peek();
		System.out.println("= = = = =  = = = = = = = = = = = = = = ");
		System.out.println("= = = = =  = = = = = = = = = = = = = = ");
		System.out.println("= = = = =  = = = = = = = = = = = = = = ");
		System.out.println("= = = = =  = = = = = = = = = = = = = = ");
		
	
		
		myq.enQueue(5, "E");


		myq.displayAllNodes();

		/*myq.peek();

		myq.deQueue();

		myq.displayAllNodes();
*/
	}

}

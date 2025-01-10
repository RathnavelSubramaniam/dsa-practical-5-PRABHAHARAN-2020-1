import java.util.Scanner;
public class LinkedList {
    class Node {
int data;
              	Node next;
    public Node(int data) {
this.data = data;
this.next = null;
        }
    }

    Node head = null;
    Node tail = null;
   
public void addNode(int data) {
  Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        }		 else {
tail.next = newNode;
              tail = newNode;
        }
    }
    
public static void main(String[] args) {
LinkedList list = new LinkedList();
Scanner scanner = new Scanner(System.in);
System.out.println("Enter integers to create nodes (enter a non-integer to exit):");
        while (scanner.hasNextInt()) {
int data = scanner.nextInt();
list.addNode(data);
        }
System.out.println("Linked List created");
System.out.println("Linked List");
list.displayList();
System.out.println("Length of the Linked List is:"+list.length());
scanner.close();
    }
int length() 
    {
  //Type your code here
    }
public void displayList() {
       Node current = head;
        while (current != null) {
System.out.print(current.data + " -> ");
            current = current.next;
        }
System.out.println("null");
    }
}

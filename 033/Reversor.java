/**
 * author : wangjinlei
 * email  : sea11107@mail.ustc.edu.cn
 */

class Node {
	public int data;
	public Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class LinkedList {

	public Node head;
	
	public LinkedList() {
		head = null;
	}
	
	// insert a node at the head of the list
	public LinkedList append(Node node) {
		node.next = head;
		this.head = node;
		return this;
	}
	
	public String toString() {
		StringBuilder sbuf = new StringBuilder();
		for (Node begin= this.head; begin != null; begin = begin.next) {
			sbuf.append(begin.data).append(",");
		}
		return sbuf.toString();
	}
	
	
	public void reverse() {
		if (this.head == null)
			return;
		this.head = reverseHelper(null, head, head.next);
	}
	
	private Node reverseHelper(Node t, Node p, Node q) {
		p.next = t;
		return (q == null) ? p : reverseHelper(p, q, q.next);
	}
}
 
 
public class Reversor {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.append(new Node(1)).append(new Node(2));//.append(new Node(3)).append(new Node(4));
		System.out.println(list);
		list.reverse();
		System.out.println(list);
	}
}

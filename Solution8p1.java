package test.AlgoSolutions;

public class Solution8p1 {
	
	private static Node merge(Node h1, Node h2){
		Node head = new Node(0);
        Node dummy = head;
		while (h1!=null && h2!=null){
			if (h1!=null && h2!=null && h1.val < h2.val){
				head.next = h1;
				h1 = h1.next;
				head = head.next;
			}
			if (h1!=null && h2!=null && h2.val >= h1.val){
				head.next = h2;
				h2 = h2.next;
				head = head.next;
			}
		}
		return dummy;
	}
	
	public static void main(String[] args){
		Node h1 = new Node(0);
		Node h2 = new Node(-1);
		merge(h1, h2);
		System.out.println("test");
	}
}


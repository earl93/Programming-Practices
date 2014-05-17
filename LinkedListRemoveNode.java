//Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node

public static boolean deleteNode (Node n){
	if (n==null || n.next == null)
		return false;//only access to the node
	Node next = n.next;
	n.data = next.data;
	n.next = next.next;
	return true;
}

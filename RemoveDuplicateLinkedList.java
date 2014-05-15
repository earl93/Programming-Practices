//Write code to remove duplicates from an unsorted linked list
public static void RemoveDuplicate (Node n){
	//assuming n is the head of the node
	Hashtable table = new Hashtable();
	Node previous = null;
	while (n != null){
		if(table.containsKey(n.data))
			previous.next = n.next;
		else{
			table.put(n.data, true);
			previous = n;
		}
		n = n.next;
	}
}

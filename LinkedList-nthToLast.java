//Implement an algorithm to find the nth to last element of a singly linked list
//a - b - c - d - e - f - null
//2nd to the last element is d

Node nthToLast (Node head, int n){
	if (head == null || n < 1)
		return null;
	
	Node p1 = head;
	Node p2 = head;
	for (int i = 0; i < n; i++){
		if(p2 == null)
			return null;//list size < n
		p2 = p2.next;
	}
	while(p2.next != null){
		p1 = p1.next;
		p2 = p2.next;
	}
	return p1;
}

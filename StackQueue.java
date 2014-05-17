//Implementation of Stack and Queue
Class Stack{
	Node top;
	Node pop(){
		if (top != null){
			Object data = top.data;
			top = top.next;
			return data;
		}
		return null;
	}
	void push(Object data){
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}
}

Class Queue{
	Node first,last;
	Node pop(){
		Object data = first.data;
		first = first.next;
		return data;
	}	
	void push(Object data){
		if(first == null){
			first = new Node(data);
			back = first;
		}
		else{
			last.next = new Node(data);
			last = last.next;
		}
	}
	
}

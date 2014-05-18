//How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum element? Push, pop and min should all operate in O(1) time

public class StackWithMin extends Stack<Integer>{
	Stack<Integer> s;
	public StackWithMin(){
		s = new Stack<Integer>;
	}
	public void push(int val){
		if(val <= min())
			s.push(val);
		super.push(val);
	}
	public Integer pop(){
		int val = super.pop();
		if(val == min())
			s.pop();
		return val;
	}
	public int min(){
		if(s.isEmpty())
			return Integer.MAX_VALUE;
		else
			return s.peek();
	}
}

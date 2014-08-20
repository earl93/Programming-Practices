import java.util.*;

public class fibonacci{
	public static void main (String[] args){
		Scanner in = new Scanner( System.in );
		int num = in.nextInt();
		//System.out.println(fibonacci(num));
		int a = 0;
		int b = 1;
		for (int i = 2; i <= num; i++){
			int temp = a;
			a = b;
			b = temp+b;
					System.out.println(b);
		}
	}
	public static int fibonacci(int n){
		if (n == 0){
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}


import java.util.*;

public class permutation{
	static int a = 0;
	public static void main (String[] args){
		permutation("", "hellohihi");
		System.out.println(a);
	}
	public static void permutation (String prefix, String str){
		if(str.length() == 0){
			System.out.println(prefix);
			a++;
		}
		else{
			for(int i =0; i < str.length(); i++){
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, str.length()));
			}
		}
	}
}

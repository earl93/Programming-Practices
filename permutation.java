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

import java.util.*;

public class pairSum{
	public static void main(String[] args){
		int[] arr = {1,2,5,6,7,4,3,3,3,2,8,9,1};
		int target = 7;
		pairSum(arr, target);
	}

	//quick sort implementation in java
	public static void pairSum(int[] arr, int target){
		Hashtable<Integer, Integer> map = new Hashtable<Integer,Integer>();
		for(int i = 0; i < arr.length; i++){
			if(!map.containsKey(target-arr[i])){
				map.put(arr[i], target-arr[i]);
			}
			else{
				System.out.println(arr[i] + "," + (target-arr[i]));
				map.remove(target-arr[i]);
			}
		}
	}

}

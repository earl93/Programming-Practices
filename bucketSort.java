//bucket sort implementation in java
public static void bucketSort(int[] arr, int maxVal){
	int[] bucket = new int [maxVal+1];
	for(int i = 0; i < bucket.length; i++){
		bucket[i] = 0;
	}
	for(int i = 0; i < arr.length; i++){
		bucket[arr[i]]++;
	}
	int count = 0;
	for(int i = 0; i < bucket.length; i++){
		for(int l = 0; l < bucket[i]; l++){
			arr[count++] = i;
		}
	}
}

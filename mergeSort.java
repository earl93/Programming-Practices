//Merge Sort implementation in java

public static void mergeSort(int[] arr){
	if(arr.length > 1){
		int[] left = leftHalf(arr);
		int[] right = rightHalf(arr);
		mergeSort(left);
		mergeSort(right);
		merge(arr, left, right);
	}
}

public static int[] leftHalf(int[] arr){
	int size = arr.length/2;
	int[] left = new int[size];
	for(int i = 0; i < size; i++){
		left[i] = arr[i];
	}
	return left;
}

public static int[] rightHalf(int[] arr){
	int leftSize = arr.length/2;
	int size = arr.length - leftSize;
	int[] right = new int[size];
	for(int i = 0; i < size; i++){
		right[i] = arr[leftSize + i];
	}
	return right;
}

public static void merge(int[] arr, int[] left, int[] right){
	int l = 0;
	int r = 0;
	for(int i = 0; i < arr.length; i++){
		if(r >= right.length) || (l < left.length && left[l] <= right[r])){
			arr[i] = left[l];
			left++;
		}else{
			arr[i] = right[r];
			right++;
		}
	}
}

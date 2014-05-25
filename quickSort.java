//quick sort implementation in java
public void quickSort(int[] arr){
	quickSort(arr, 0, arr.length-1);
}

public void quickSort(int[] arr, int start, int end){
	int i = start;
	int k = end;
	if (end - start >= 1){
		int pivot = arr[start];
		while (k > i){
			while (arr[i] <= pivot && i <= end && k > i)
				i++;
			while (arr[k] > pivot && k >= start && k >= i)
				k--;
			if (k > i)
				swap(arr, i, k);
		}
		swap(arr, start, k);
		quickSort(arr, start, k-1);
		quickSort(arr, k+1, end);
	}
	else
		return;
}

public void swap(int[] arr, int a, int b){
	int temp = arr[a];
	arr[a] = arr[b];
	arr[b] = temp;
}

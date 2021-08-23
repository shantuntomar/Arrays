class QuickSort {

	static int partition(int arr[] , int l , int h) {
		int pivot = arr[h];
		int i = (l-1);
		for(int j=l; j<h; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[h];
		arr[h] =temp;

		return (i+1);
	} 

	static void quicksort(int a[] , int l , int h) {
		if(l<h) {
			int pi = partition(a,l,h);
			quicksort(a,l,pi-1);
			quicksort(a,pi+1,h);
		}
	}

	public static void main(String[] args) {

		int arr[] = {9,8,7,6,5,4,3,2,1};
		quicksort(arr, 0 , arr.length-1);

		for(int ele : arr) {
			System.out.print(ele+" ");	
		}
	}
}

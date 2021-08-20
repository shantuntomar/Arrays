class QuickSort {

	public static void swap(int arr[] , int a , int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	} 

	public static int partition(int arr[] , int l , int h) {
		int pivot = arr[h];
		int i = (l-1);
		for(int j=l; j<=h-1; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,h);
		return (i+1);
	} 

	public static void quickSort(int arr[] , int l , int h) {
		if( l < h) {
			int pi = partition(arr,l,h);
			quickSort(arr,l,pi-1);
			quickSort(arr,pi+1,h);
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {9,8,7,6,5,4,3,2,1};
		quickSort(arr , 0 , arr.length-1);

		for(int ele : arr) {
			System.out.print(ele+" ");	
		}
	}
}



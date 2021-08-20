class InsertionSort {

	public static void insertionSort(int arr[]) {

		for(int i=1; i<arr.length; i++) {
			int t = arr[i];
			int j = i-1;
			while( j>= 0 && arr[j] > t) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = t;
		}
		
	}

	public static void main(String[] args) {

		int arr[] = {9,8,7,6,5,4,3,2,1};
		insertionSort(arr);
		
		for(int ele : arr) {
			System.out.print(ele + " " );
		}
	}
}

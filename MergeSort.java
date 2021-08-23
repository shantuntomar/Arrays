class MergeSort {

	static void mergeArray(int arr[] , int l , int m , int h) {
		int n1 = m-l+1; 
		int n2 = h-m;
		int l1[] = new int[n1];
		int m1[] = new int[n2];
		for(int i=0; i<n1; i++) {
			l1[i] = arr[l+i];
		}
		for(int j=0; j<n2; j++) {
			m1[j] = arr[m+1+j];
		}
		int i=0 , j=0 , k=l;
		while(i<n1 && j<n2) {
			if(l1[i] <= m1[j]) {
				arr[k] = l1[i];
				i++;
			}
			else {
				arr[k] = m1[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k] = l1[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = m1[j];
			j++;
			k++;
		}
	}

	static void mergeSort( int arr[] , int l , int h) {
		if(l<h) {
			int mid = (l+h)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			mergeArray(arr,l,mid,h);
		}
	}


	public static void main(String[] args) {
		int arr[] = {9,8,7,6,5,4,3,2,1};
		mergeSort(arr,0,arr.length-1);

		for(int ele : arr) {
			System.out.print(ele + " ");	
		}
	}
}







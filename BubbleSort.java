import java.util.*;

class BubbleSort {

	public static void bubbleSort( int arr[] ) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {9,8,7,6,5,4,3,2,1};
		bubbleSort(arr);

		for( int ele : arr ) {
				System.out.print(ele + " " );	
		}
	}
}




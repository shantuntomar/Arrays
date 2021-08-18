// array must be sorted 

import java.util.*;

class BinarySearch {

	static boolean binarySearch(int arr[] , int key) {
		int low = 0;
		int high = arr.length-1;

		while(low <= high ) {
			int mid = (low+high)/2;
			if(arr[mid] == key ) {
				return true;
			}
			else if(key > arr[mid]) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
			
		}

		return false;
	}


	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int key = 8;
		if(binarySearch(arr,key)) {
			System.out.println("present ");	
		}
		else {
			System.out.println("not present ");
		}
		
	}
}

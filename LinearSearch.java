import java.util.*;

class LinearSearch {

	static boolean linearSearch(int arr[] , int key) {

		for(int i : arr) {
			if(i == key) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int key = 60;

		if(linearSearch(arr , key)) {
			System.out.println("present ");
		}
		else {
			System.out.println("not present ");
		}
	}
}

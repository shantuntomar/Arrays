import java.util.*;

class MinAndMaxEleInArray {

	static class Pair {
		int min;
		int max;
	}

	static Pair getMinMax(int arr[] , int size) {
		Pair minmax = new Pair();
		int i;
		if(size%2 == 0) {
			if(arr[0] > arr[1]) {
				minmax.min = arr[1];
				minmax.max = arr[0];
			}
			else {
				minmax.min = arr[0];
				minmax.max = arr[1];
			}
			i=2;
		}
		else {
			minmax.min = arr[0]; // 1
			minmax.max = arr[0]; // 1 
			i=1;
		}
		while( i< size-1 ) {
			if(arr[i] > arr[i+1]) {
				if(arr[i] > minmax.max) minmax.max = arr[i];
				if(arr[i+1] < minmax.min) minmax.min = arr[i];
			}
			else {
				if(arr[i+1] > minmax.max) minmax.max = arr[i+1];
				if(arr[i] < minmax.min) minmax.min = arr[i];
				
			}
			i+=2;
		}
		return minmax;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int size = arr.length;
		Pair minmax = getMinMax(arr,size);
		System.out.println("MAXIMUM => " + minmax.max + " MINIMUM => "+ minmax.min );
	}
}

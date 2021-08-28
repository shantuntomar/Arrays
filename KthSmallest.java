import java.util.*;

class KthSmallest {

	public static int kthSmallest(int arr[] , int k) {
		Arrays.sort(arr); // 3 , 5, 7, 12 , 19
		int ans = arr[k-1];
		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {12,3,5,7,19};
		int res = kthSmallest(arr , 2);
		System.out.println(res);
	}
}



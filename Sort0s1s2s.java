class Sort0s1s2s {
	
	public static void sort0s(int a[]) {
		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<a.length; i++) {
			switch(a[i]) {
				case 0:
					count0++; // 3
					break;
				case 1:
					count1++; // 3
					break;
				case 2:
					count2++; // 3 
					break;
			}
		}
		int j = 0;
			while(count0 > 0) {
				a[j++] = 0;
				count0--;
			}
			while(count1 > 0) {
				a[j++] = 1;
				count1--;
			}
			while(count2 > 0) {
				a[j++] = 2;
				count2--;
			}
	}
	public static void main(String[] args) {
		int arr[] = {2,2,2,0,0,0,1,1,1};
		sort0s(arr);
		for(int e : arr) {
			System.out.print(e+" ");
		}
		
	}
}

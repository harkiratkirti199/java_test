package io.pragra.learning;

public class Question10 {
	
	public static void main(String args[]) {
		
		int b[]=new int[] {10,20,30,40};
		reverseArray(b,b.length);
		
	}

	
	
	
	public static void reverseArray(int a[], int l) {

		int arr[] = new int[l];

		for (int i = 0; i < arr.length; i++) {
			arr[i]=a[l-1];
			l--;
			
		}
		
		System.out.println("Reverse Array is---->");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
			
		}
	}

}

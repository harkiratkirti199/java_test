package io.pragra.learning;

public class Question9 {
	public static void main(String args[]) {

		int b[] = new int[] { 30, 10, 5, 1,100 };
		sortArray(b, b.length);

	}

	public static void sortArray(int a[], int l) {
		int temp;

		for (int i = 0; i < l; i++) {
			for (int j = i; j < l; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		System.out.println("Sorted Array is------>");
		for (int i = 0; i < l; i++) {
			System.out.println(a[i]);
		}

	}

}

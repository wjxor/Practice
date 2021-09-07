package jungol;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[10];
		String str = "";

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}

	}

}

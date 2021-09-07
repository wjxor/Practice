package jungol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int num;

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			num = sc.nextInt();
			if (num == 0) {
				for (int j = i - 1; j >= 0; j--) {
					System.out.printf("%d ", arr[j]);
				}
				break;
			} else {
				arr[i] = num;
			}

		}

	}

}

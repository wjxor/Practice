package jungol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		int num;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			min = Math.min(arr[i], min);
		}

		System.out.println(min);

	}

}

package jungol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];

		int sum = 0;
		float avg = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		for (int i = 1; i < arr.length; i += 2) {
			sum += arr[i];
		}

		for (int i = 0; i < arr.length; i += 2) {
			avg += arr[i];
		}

		avg /= 5;

		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);

	}

}

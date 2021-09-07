package jungol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] score = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		int class_num1 = sc.nextInt() - 1;
		int class_num2 = sc.nextInt() - 1;

		System.out.printf("%.1f", score[class_num1] + score[class_num2]);

	}

}

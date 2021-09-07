package jungol;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[] arr = new char[10];
		String str = "";

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			str = sc.next();
			arr[i] = str.charAt(0);
		}

		System.out.printf("%c %c %c", arr[0], arr[3], arr[6]);

	}

}

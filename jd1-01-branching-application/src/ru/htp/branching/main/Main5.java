package ru.htp.branching.main;

import java.util.Scanner;

public class Main5 {

//  6. Составить программу: определения наибольшего из двух чисел а и b. 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		System.out.println("a= ");
		while(!sc.hasNextInt()) {
			sc.next();
			System.out.println("a= ");
		}
		a = sc.nextInt();

		System.out.println("b= ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("b= ");
		}
		b = sc.nextInt();
		
		if (a>b) {
			System.out.println("Число " + a + " больше числа " + b);
		}
		else {
			System.out.println("Число " + b + " больше числа " + a);
		}

	}

}

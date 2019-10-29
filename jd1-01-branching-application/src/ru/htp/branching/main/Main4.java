package ru.htp.branching.main;

import java.util.Scanner;

public class Main4 {

//  5. —оставить программу: определени€ наименьшего из двух чисел а и b. 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		System.out.println("¬ведите число а:");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("¬ведите число а:");
		}
		a = sc.nextInt();

		System.out.println("¬ведите число b:");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("¬ведите число b:");
		}
		b = sc.nextInt();

		if (a < b) {
			System.out.println("„исло " + a + " меньше " + b);
		} else {
			System.out.println("„исло " + b + " меньше " + a);
		}

	}

}

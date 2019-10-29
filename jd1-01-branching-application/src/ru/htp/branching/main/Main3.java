package ru.htp.branching.main;

import java.util.Scanner;

public class Main3 {

//  4. —оставить программу:  равны ли два числа а и b? 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		System.out.println("¬ведите число а:");
		a = sc.nextInt();
		System.out.println("¬ведите число b:");
		b = sc.nextInt();

		if (a == b) {
			System.out.println("„исло а и b равны");
		} else {
			System.out.println("„исло a и b не равны");
		}

	}

}

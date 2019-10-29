package ru.htp.branching.main;

import java.util.Scanner;

public class Main8 {

// 9. Составить программу, которая определит по трем введенным сторонам, 
//	является ли данный треугольник равносторонним.

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a == b && b == c) {
			System.out.println("Треугольник равносторонний");
		}
		else {
			System.out.println("У треугольника стороны не равны");
		}

	}

}

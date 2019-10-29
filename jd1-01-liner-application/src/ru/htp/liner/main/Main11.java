package ru.htp.liner.main;

import java.util.Scanner;

public class Main11 {

// 12. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2). 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int x1, x2, y1, y2;
		double c;

		System.out.println("Введите координату x1");
		x1 = sc.nextInt();

		System.out.println("Введите координату x2");
		x2 = sc.nextInt();

		System.out.println("Введите координату y1");
		y1 = sc.nextInt();

		System.out.println("Введите координату y2");
		y2 = sc.nextInt();

		c = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Расстояния между точками = " + c);

	}

}

package ru.htp.branching.main;

import java.util.Scanner;

public class Main10 {

//  11. —оставить программу, котора€ определит площадь какого треугольника больше.

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int b, h, b1, h1;
		int result, result1;

		System.out.println("¬ведите основание треугольника");
		b = sc.nextInt();

		System.out.println("¬ведите высоту треугольника");
		h = sc.nextInt();

		result = (b * h) / 2;

		System.out.println("¬ведите основание второго треугольника");
		b1 = sc.nextInt();

		System.out.println("¬ведите высоту второго треугольника");
		h1 = sc.nextInt();

		result1 = (b1 * h1) / 2;

		if (result < result1) {
			System.out.println(
					"ѕлощадь первого треугольника " + result + " меньше площади второго треугольника " + result1);
		} else {
			System.out.println(
					"ѕлощадь первого треугольника " + result + " больше площади второго треугольника " + result1);
		}

	}

}

package ru.htp.branching.main;

import java.util.Scanner;

public class Main9 {

//  10. Составить программу, которая определит площадь какого круга меньше. 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int r1;
		int r2;

		double sR1;
		double sR2;

		System.out.println("Введите радиус первого круга:");
		r1 = sc.nextInt();

		System.out.println("Введите радиус второго круга:");
		r2 = sc.nextInt();

		sR1 = 3.14 * Math.pow(r1, 2);
		sR2 = 3.14 * Math.pow(r2, 2);

		if (sR2 < sR1) {
			System.out.println("Площадь первого круга" + sR1 + " больше второго " + sR2);
		} else {
			System.out.println("Площадь второга круга " + sR2 + " больше первого " + sR1);
		}

	}

}

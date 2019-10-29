package ru.htp.cycles.main;

import java.util.Scanner;

public class Main21 {

//  22. —оставить программу дл€ вычислени€ значений функции  F(x) 
//	на отрезке [а, b] с шагом h. –езультат представить в виде таблицы, 
//	первый столбец которой Ц значени€  аргумента, второй - соответствующие 
//	значени€ функции: F(x) = sin^2(x)

	public static void main(String[] args) {

		double a;
		double b;
		double h;
		double res;

		a = enterFromConsole("¬ведите начальную точку отрезка:");
		b = enterFromConsole("¬ведите конечную точку отрезка:");
		h = enterFromConsole("¬ведите шаг:");

		for (; a <= b; a = a + h) {

			res = Math.pow(Math.sin(a), 2);

			System.out.println("---------------------------");
			System.out.print(a + "  I  ");
			System.out.println(res);

		}

	}

/////////////////////////////////////////////////////////
	public static double enterFromConsole(String mesage) {

		double value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(mesage);
		while (!sc.hasNextDouble()) {

			sc.next();
			System.out.println(mesage);

		}

		value = sc.nextDouble();

		return value;
	}
/////////////////////////////////////////////////////////
}
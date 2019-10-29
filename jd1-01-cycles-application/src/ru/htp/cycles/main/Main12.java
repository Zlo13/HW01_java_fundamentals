package ru.htp.cycles.main;

public class Main12 {

//  13. Составить таблицу значений функции y = 5 - x2/2 на отрезке [-5; 5] с шагом 0.5. 

	public static void main(String[] args) {

		double a = -5, b = 5, h = 0.5, y = 1;

		while (a <= b) {

			y = 5 - (Math.pow(a, 2) / 2);

			System.out.print(a + " ----- ");
			System.out.println(y);

			a = a + h;

		}

	}

}

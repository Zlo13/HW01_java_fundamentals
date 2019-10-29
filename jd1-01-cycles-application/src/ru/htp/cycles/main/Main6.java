package ru.htp.cycles.main;

public class Main6 {

//  7. Вычислить значения функции на отрезке [а,b] c шагом h: 

	public static void main(String[] args) {
		double a, b, h;
		double x, y;

		a = 0;
		b = 5;
		h = 0.5;

		while (a < b) {
			a = a + h;
			x = a;
		
			if (x > 2) {
				y = x;
				System.out.println("y = " + y);
			} else {
				y = -1 * x;
				System.out.println("y = " + y);
			}
		}

	}

}

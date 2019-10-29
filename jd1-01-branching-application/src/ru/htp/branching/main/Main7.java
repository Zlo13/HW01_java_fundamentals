package ru.htp.branching.main;

public class Main7 {

// 8. —оставить программу нахождени€ наименьшего из квадратов двух чисел а и b. 

	public static void main(String[] args) {

		int a;
		int b;

		int a2;
		int b2;

		a = 2;
		b = 5;

		a2 = a * a;
		b2 = b * b;

		if (a2 < b2) {
			System.out.println(" вадрат числа " + a + " меньше квадрата числа " + b);
		} else {
			System.out.println(" вадрат числа " + b + " меньше квадрата числа " + a);
		}
	}

}

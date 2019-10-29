package ru.htp.branching.main;

public class Main11 {

// 12. Даны три действительных числа. Возвести в квадрат те из них, 
//	значения которых неотрицательны, и в четвертую степень — отрицательные. 

	public static void main(String[] args) {

		double a = -15;
		double b = 10;
		double c = -2;

		if (a < 0) {
			a = Math.pow(a, 4);
			System.out.println("отр " + a);
		} else {
			a = Math.pow(a, 2);
			System.out.println("пол " + a);
		}

		if (b < 0) {
			b = Math.pow(b, 4);
			System.out.println("отр " + b);
		} else {
			b = Math.pow(b, 2);
			System.out.println("пол " + b);
		}

		if (c < 0) {
			c = Math.pow(c, 4);
			System.out.println("отр " + c);
		} else {
			c = Math.pow(c, 2);
			System.out.println("пол " + c);
		}

	}

}

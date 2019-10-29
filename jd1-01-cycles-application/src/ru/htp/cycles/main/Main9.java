package ru.htp.cycles.main;

public class Main9 {

//  10. Составить программу нахождения произведения квадратов первых двухсот чисел. 

	public static void main(String[] args) {

		double res = 1;

		for (int i = 1; i <= 200; i++) {

			res = res * Math.pow(i, 2);

		}

		System.out.println(res);

	}

}

package ru.htp.cycles.main;

public class Main8 {

//  9. Найти сумму квадратов первых ста чисел. 

	public static void main(String[] args) {

		double pow = 0;

		for (int i = 1; i <= 100; i++) {

			pow = pow + Math.pow(i, 2);

		}

		System.out.println(pow);

	}

}

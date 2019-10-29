package ru.htp.cycles.main;

import java.util.Random;

public class Main28 {

// 29. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 

	public static void main(String[] args) {

		int a;
		int b;
		int c, d;
		
		a = randomValue(10000);
		b = randomValue(10000);

		while (a != 0 && b != 0) {

			c = a % 10;
			a = a / 10;

			d = b % 10;
			b = b / 10;

			System.out.println(c + " --- " + d);
		}

	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit);
	}

}

package ru.htp.cycles.main;

public class Main14 {

//  15. Вычислить : 1+2+4+8+...+ 2 в 10 степени.

	public static void main(String[] args) {

		double a = 0, b = 0;

		for (int i = 0; i <= 10; i++) {

			a = Math.pow(2, i);
			b += a;
			System.out.println(a);

		}

		System.out.println("--------");
		System.out.println(b);

	}

}

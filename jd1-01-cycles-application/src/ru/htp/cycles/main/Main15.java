package ru.htp.cycles.main;

public class Main15 {

// 16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10). 

	public static void main(String[] args) {
		long a = 1, b = 1;

		for (int i = 2; i <= 10; i++) {

			a = a + i;
			b = b * a;

			System.out.println(a);

		}

		System.out.println("------------");
		System.out.println(b);

	}

}

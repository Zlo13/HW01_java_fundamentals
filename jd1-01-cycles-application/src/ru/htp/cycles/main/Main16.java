package ru.htp.cycles.main;

public class Main16 {

//  17. ƒаны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1) 

	public static void main(String[] args) {
		int a = 2, n, b = 1;

		for (int i = 1; i <= 15; i++) {
			n = a + (i - 1);
			b = b * n;
			System.out.println(n);
		}
		System.out.println("----------");
		System.out.println(b);
	}

}

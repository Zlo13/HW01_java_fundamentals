package ru.htp.liner.main;

import java.util.Scanner;

public class Main10 {

//  11. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов. 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		
		int s;
		double p;

		System.out.println("a = ");
		a = sc.nextInt();
		
		System.out.println("b = ");
		b = sc.nextInt();

		s = a * b / 2;
		System.out.println("Площадь треугольгика = " + s);
		
		p = a + b + Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		System.out.println("Периметр прямоугольного треугольника = " + p);

	}

}

package ru.htp.cycles.main;

import java.util.Scanner;

public class Main20 {

// 21. —оставить программу дл€ вычислени€ значений функции  F(x) на 
//	отрезке [а, b] с шагом h. –езультат представить в виде таблицы, 
//	первый столбец которой Ц значени€  аргумента, второй - с
//	оответствующие значени€ функции: F(x)=x-sin(x)

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double h;
		double res;

		System.out.println("¬ведите начальную точку отрезка:");
		a = sc.nextInt();
		
		System.out.println("¬ведите конечную точку отрезка:");
		b = sc.nextInt();
		
		System.out.println("¬ведите шаг:");
		h = sc.nextDouble();
		
		for ( ; a <= b ; a = a + h ) {
			
			res = a - Math.sin(a);
			
			System.out.print(a + "  I  ");
			System.out.println(res);
			
		}

	}

}

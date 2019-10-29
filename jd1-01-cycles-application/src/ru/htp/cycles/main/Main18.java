package ru.htp.cycles.main;

public class Main18 {

// 19. Даны числовой ряд и некоторое число е. Найти сумму тех членов 
//	ряда, модуль которых больше или равен заданному е. Общий член 
//	ряда имеет вид: 

	public static void main(String[] args) {

		int e = 2;
		double a, b = 0;

		for (int i = -3; i <= 1; i++) {

			a = (1 / Math.pow(2, i)) + (1 / Math.pow(3, i));

			if (e <= Math.abs(i)) {

				b = b + a;

				System.out.println("-------------");
				System.out.println(i + "  ----  " + a);

			}

		}
		
		System.out.println("-------------");
		System.out.println("-------------");
		System.out.println(b);
	}

}

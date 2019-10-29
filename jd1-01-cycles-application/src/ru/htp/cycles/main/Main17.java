package ru.htp.cycles.main;

public class Main17 {

//  18. Даны числовой ряд и некоторое число е. Найти сумму тех членов 
//	ряда, модуль которых больше или равен заданному е. Общий член 
//	ряда имеет вид: an=(-1)^n-1/n

	public static void main(String[] args) {

		double e = 4, c = 1, b = 0;

		for (int i = -5; i <= 5; i++) {

			c = Math.pow(-1, i - 1) / i;

			if (e == Math.abs(i)) {

				b = b + c;

				System.out.println(c);

			}

		}
		System.out.println("-------");
		System.out.println(b);
	}

}

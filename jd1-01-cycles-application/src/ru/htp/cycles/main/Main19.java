package ru.htp.cycles.main;

public class Main19 {

// 20. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
//	модуль которых больше или равен заданному е. Общий член ряда имеет вид: 

	public static void main(String[] args) {

		int b;
		int e;
		double res;
		double temp = 0;

		b = 7;
		e = 4;

		for (int a = -9; a <= b; a++) {
			res = 100 / ((3 * a) - 2) * ((3 * a) + 1);

			if (Math.abs(a) >= e) {
				System.out.print(a + " -------- ");
				System.out.println(res);
				
				temp = temp + res;
			}

		}
		System.out.println("---------------");
		System.out.println(temp);
	}

}

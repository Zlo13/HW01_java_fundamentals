package ru.htp.liner.main;

public class Main16 {

// 17. Даны два числа. Найти среднее арифметическое кубов 
//	этих чисел и среднее геометрическое модулей этих чисел. 

	public static void main(String[] args) {

		int a = 5, b = 8;
		double ar, geom;

		ar = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		System.out.println("Среднее арифметическое кубов = " + ar);

		geom = Math.sqrt(a * b);
		System.out.println("Среднее геометрическое модулей = " + geom);

	}

}

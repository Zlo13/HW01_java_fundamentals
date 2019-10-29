package ru.htp.liner.main;

public class Main8 {

// 9. Вычислить значение выражения по формуле (все переменные принимают действительные значения): 
// (a/c)*(b/d)-((a*b-c)/c*d)	

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;
		double result;

		a = 10;
		b = 12;
		c = 8;
		d = 7;

		result = (a / c * b / d) - (a * b - c) / c * d;

		System.out.println(result);

	}

}

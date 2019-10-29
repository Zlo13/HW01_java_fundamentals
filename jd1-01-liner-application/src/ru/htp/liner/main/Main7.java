package ru.htp.liner.main;

public class Main7 {

// 8. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
// (b+sqrt((b*b)+(4*a*c))/2*a)-a*a*a*c+pow(b,-2).

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double z;

		a = 2;
		b = 4;
		c = 6;

		z = ((b + Math.sqrt((b * b) + 4 * a * c) / 2 * a)) - (Math.pow(a, 3) * c + Math.pow(b, -2));

		System.out.println(z);

	}

}

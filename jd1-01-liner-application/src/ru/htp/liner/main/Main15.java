package ru.htp.liner.main;

public class Main15 {

//  16. Найти произведение цифр заданного четырехзначного числа.

	public static void main(String[] args) {

		int a = 1789;
		int b, c, d, e, res;

		e = a % 10;
		System.out.println(e);

		d = a % 100 / 10;
		System.out.println(d);

		c = a % 1000 / 100;
		System.out.println(c);

		b = a / 1000;
		System.out.println(b);

		res = e * d * c * b;
		System.out.println(res);

	}

}

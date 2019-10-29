package ru.htp.liner.main;

public class Main {

//1. Даны два действительных числа х и  у. Вычислить их сумму, разность, произведение и частное.

	public static void main(String[] args) {
		double x;
		double y;

		x = Math.random();
		y = Math.random();

		double sum = x + y;
		double diff = x - y;
		double mult = x * y;
		double div = x / y;

		System.out.println("Сумма чисел х и у = " + sum);
		System.out.println("Разность чисел х и у = " + diff);
		System.out.println("Произведение чисел х и у = " + mult);
		System.out.println("Частное чисел х и у = " + div);

	}

}

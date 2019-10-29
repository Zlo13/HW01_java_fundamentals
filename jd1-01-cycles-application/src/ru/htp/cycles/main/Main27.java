package ru.htp.cycles.main;

import java.util.Scanner;

public class Main27 {

	/*
	 * 28. Написать программу, в которой вводятся два операнда Х и Y и знак операции
	 * (+, –, /, *). Вычислить результат Z в зависимости от знака. Предусмотреть
	 * реакции на возможный неверный знак операции, а также на ввод Y=0 при делении.
	 * Организовать возможность многократных вычислений без перезагрузки программа
	 * (т.е. построить цикл). В качестве символа прекращения вычислений принять ‘0’.
	 */
	public static void main(String[] args) {
		double x;
		double y;
		double z = 0;
		char sign;

		x = enterFromConsole("Введите первое число уровнения ");
		sign = enterSignFromConsole("Укажите знак операции ");
		y = enterFromConsole("Введите второе значение уровнения ");

		//print(calc);

	}

	public static void calc (double x) {
		
	
		//z=x+y;

		//return z;

	}

	public static char enterSignFromConsole(String mesage) {

		char value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(mesage);

		value = sc.next().charAt(0);

		return value;
	}

	public static double enterFromConsole(String mesage) {

		double value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(mesage);

		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println(mesage);
		}
		value = sc.nextDouble();
		return value;

	}

	public static void print(double f, String mesage) {
		System.out.println(mesage + f);
	}

	public static void print2(char i) {
		System.out.println(i);
	}

}

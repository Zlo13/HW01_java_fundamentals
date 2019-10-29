package ru.htp.cycles.main;

import java.util.Scanner;

public class Main5 {

//  6. Напишите программу, где пользователь вводит любое 
//	целое положительное число. А программа суммирует все 
//	числа от 1 до введенного пользователем числа. 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int sum;

		System.out.println("Введите целое положительное число: ");

		a = 0;
		sum = 0;
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите целое положительное число: ");
		}
		b = sc.nextInt();

		while (a < b) {
			a++;
			sum += a;
		}
		System.out.println(sum);

	}

}

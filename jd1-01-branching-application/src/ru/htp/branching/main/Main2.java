package ru.htp.branching.main;

import java.util.Scanner;

public class Main2 {

// 3. Составить программу сравнения введенного числа а и цифры 3. 
//	Вывести на экран слово «yes», если число а меньше 3; если 
// 	больше, то вывести слово «no». 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Введите число: ");

		double a;
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Введите число: ");
		}

		a = sc.nextDouble();

		if (a < 3) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}

	}

}

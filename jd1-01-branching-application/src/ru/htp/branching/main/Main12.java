package ru.htp.branching.main;

import java.util.Scanner;

public class Main12 {

//   13. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, 
//	которая из точек находится ближе к началу координат. 

	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = readFromConsole("тру ля ля");
		b = readFromConsole("тру ля ля");
		
		// Доделаю потом, не успел :(

	}
	public static int sum (int a, int b) {
		int sum;
		sum = a+b;
		return sum;
	}

	public static int readFromConsole(String mesage) {

		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(mesage);

		while (!sc.hasNextInt()) {
			sc.nextInt();
			System.out.println(mesage);
		}
		value = sc.nextInt();
		return value;

	}
	
	public static void print (int x) {
		System.out.println(x);
	}

}

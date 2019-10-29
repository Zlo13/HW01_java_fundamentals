package ru.htp.cycles.main;

import java.util.Scanner;

public class Main29 {

//  30. Написать программу, переводящую римские цифры в арабские.

	public static void main(String[] args) {

		char rim;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(">");
		rim = sc.next().charAt(0);

		int ar = 0;

		switch (rim) {
		case ('I'):
			ar = 1;
			break;
		case ('V'):
			ar = 5;
			break;
		case ('X'):
			ar = 10;
			break;
		case ('L'):
			ar = 50;
			break;
		case ('C'):
			ar = 100;
			break;
		case ('D'):
			ar = 500;
			break;
		case ('M'):
			ar = 1000;
			break;
		}

		System.out.println(ar);
	}
}
package ru.htp.branching.main;

import java.util.Scanner;

public class Main12 {

//   13. ���� ��� ����� �(�1, �1) � �(�2, �2). ��������� ��������, ������������, 
//	������� �� ����� ��������� ����� � ������ ���������. 

	public static void main(String[] args) {
		
		int a;
		int b;
		
		a = readFromConsole("��� �� ��");
		b = readFromConsole("��� �� ��");
		
		// ������� �����, �� ����� :(

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

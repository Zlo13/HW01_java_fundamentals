package ru.htp.branching.main;

import java.util.Scanner;

public class Main4 {

//  5. ��������� ���������: ����������� ����������� �� ���� ����� � � b. 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		System.out.println("������� ����� �:");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("������� ����� �:");
		}
		a = sc.nextInt();

		System.out.println("������� ����� b:");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("������� ����� b:");
		}
		b = sc.nextInt();

		if (a < b) {
			System.out.println("����� " + a + " ������ " + b);
		} else {
			System.out.println("����� " + b + " ������ " + a);
		}

	}

}

package ru.htp.cycles.main;

import java.util.Scanner;

public class Main5 {

//  6. �������� ���������, ��� ������������ ������ ����� 
//	����� ������������� �����. � ��������� ��������� ��� 
//	����� �� 1 �� ���������� ������������� �����. 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int sum;

		System.out.println("������� ����� ������������� �����: ");

		a = 0;
		sum = 0;
		
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("������� ����� ������������� �����: ");
		}
		b = sc.nextInt();

		while (a < b) {
			a++;
			sum += a;
		}
		System.out.println(sum);

	}

}

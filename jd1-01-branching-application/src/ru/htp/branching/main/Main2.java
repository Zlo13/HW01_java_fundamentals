package ru.htp.branching.main;

import java.util.Scanner;

public class Main2 {

// 3. ��������� ��������� ��������� ���������� ����� � � ����� 3. 
//	������� �� ����� ����� �yes�, ���� ����� � ������ 3; ���� 
// 	������, �� ������� ����� �no�. 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("������� �����: ");

		double a;
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("������� �����: ");
		}

		a = sc.nextDouble();

		if (a < 3) {
			System.out.println("Yes");
		} else {
			System.out.println("no");
		}

	}

}

package ru.htp.cycles.main;

import java.util.Scanner;

public class Main26 {

//  27. ��� ������� ������������ ����� � ���������� �� m �� n ������� 
//	��� ��������, ����� ������� � ������ �����. m � n �������� � ����������.

	public static void main(String[] args) {

		int m;
		int n;
		int a = 0;

		m = enterFromConsole("������� ���������� ��: ");
		n = enterFromConsole("��: ");

		for (;m <= n; m++) {
			a = m;
			
			System.out.print(m + "----");

			for (int i=1; i<=m; i++) {
				a = a / i;
				System.out.print(a + " ");
			}
			
			System.out.println();

		}

	}

	public static int enterFromConsole(String mesage) {
		int value;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println(mesage);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(mesage);
		}
		value = sc.nextInt();
		return value;

	}

}

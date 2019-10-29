package ru.htp.cycles.main;

import java.util.Scanner;

public class main22 {

//      23. ��������� ��������� ��� ���������� �������� ������� F(x)
//		�� ������� [�, b] � ����� h. ��������� ����������� � ���� �������, 
//		������ ������� ������� � ��������  ���������, ������ - ��������������� 
//		�������� �������: F(x) = ctg(x/3)+1/2Sin(x)

	public static void main(String[] args) {

		double a;
		double b;
		double h;
		double res;

		a = enterFromConsole("������� ��������� ����� �������:");
		b = enterFromConsole("������� �������� ����� �������:");
		h = enterFromConsole("������� ���:");

		for (; a <= b; a = a + h) {

			res = 1 / (Math.tan(a/3)) + 1/2 * (Math.sin(a));

			System.out.println("---------------------------");
			System.out.print(a + "  I  ");
			System.out.println(res);

		}

	}

	/////////////////////////////////////////////////////////
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
	/////////////////////////////////////////////////////////
}
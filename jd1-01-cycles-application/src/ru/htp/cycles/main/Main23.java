package ru.htp.cycles.main;

import java.util.Random;

public class Main23 {

// 24. �������� ����������� �����. ����� ����� ������ ����, 
//	�������� � ��� ������. ������������� ��� � ������ �����, 
//	����� �������� ����� ��������� � �������� ������� �� 
//	��������� � ��������� ������. 

	public static void main(String[] args) {

		int a;
		
		a=randomValue(100000);

		System.out.println("����������� ����� = " + a);
		System.out.println("------------------------------");
		int res = 0;
		int sum = 0;
		int invert = 0;

		while (a != 0) {
			res = a % 10;
			a = a / 10;
			System.out.println(res + " --- " + a);
			invert = invert * 10 + res;

			if (res % 2 == 0) {
				sum = sum + res;

			}
		}
		System.out.println("-----------------------------");
		System.out.println("����� ������ ����� = " + sum);

		System.out.println("-----------------------------");
		System.out.println("��������������� ����� = " + invert);
	}

	public static int randomValue(int limit) {
		Random rend = new Random();
		return rend.nextInt(limit);
	}
}

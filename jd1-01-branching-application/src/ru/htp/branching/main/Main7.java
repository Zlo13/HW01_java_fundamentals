package ru.htp.branching.main;

public class Main7 {

// 8. ��������� ��������� ���������� ����������� �� ��������� ���� ����� � � b. 

	public static void main(String[] args) {

		int a;
		int b;

		int a2;
		int b2;

		a = 2;
		b = 5;

		a2 = a * a;
		b2 = b * b;

		if (a2 < b2) {
			System.out.println("������� ����� " + a + " ������ �������� ����� " + b);
		} else {
			System.out.println("������� ����� " + b + " ������ �������� ����� " + a);
		}
	}

}

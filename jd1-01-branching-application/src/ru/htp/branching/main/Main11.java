package ru.htp.branching.main;

public class Main11 {

// 12. ���� ��� �������������� �����. �������� � ������� �� �� ���, 
//	�������� ������� ��������������, � � ��������� ������� � �������������. 

	public static void main(String[] args) {

		double a = -15;
		double b = 10;
		double c = -2;

		if (a < 0) {
			a = Math.pow(a, 4);
			System.out.println("��� " + a);
		} else {
			a = Math.pow(a, 2);
			System.out.println("��� " + a);
		}

		if (b < 0) {
			b = Math.pow(b, 4);
			System.out.println("��� " + b);
		} else {
			b = Math.pow(b, 2);
			System.out.println("��� " + b);
		}

		if (c < 0) {
			c = Math.pow(c, 4);
			System.out.println("��� " + c);
		} else {
			c = Math.pow(c, 2);
			System.out.println("��� " + c);
		}

	}

}

package ru.htp.branching.main;

import java.util.Scanner;

public class Main8 {

// 9. ��������� ���������, ������� ��������� �� ���� ��������� ��������, 
//	�������� �� ������ ����������� ��������������.

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int a, b, c;

		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (a == b && b == c) {
			System.out.println("����������� ��������������");
		}
		else {
			System.out.println("� ������������ ������� �� �����");
		}

	}

}

package ru.htp.cycles.main;

import java.util.Scanner;

public class Main20 {

// 21. ��������� ��������� ��� ���������� �������� �������  F(x) �� 
//	������� [�, b] � ����� h. ��������� ����������� � ���� �������, 
//	������ ������� ������� � ��������  ���������, ������ - �
//	�������������� �������� �������: F(x)=x-sin(x)

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		double a;
		double b;
		double h;
		double res;

		System.out.println("������� ��������� ����� �������:");
		a = sc.nextInt();
		
		System.out.println("������� �������� ����� �������:");
		b = sc.nextInt();
		
		System.out.println("������� ���:");
		h = sc.nextDouble();
		
		for ( ; a <= b ; a = a + h ) {
			
			res = a - Math.sin(a);
			
			System.out.print(a + "  I  ");
			System.out.println(res);
			
		}

	}

}

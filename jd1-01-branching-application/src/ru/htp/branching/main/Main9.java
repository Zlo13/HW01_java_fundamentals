package ru.htp.branching.main;

import java.util.Scanner;

public class Main9 {

//  10. ��������� ���������, ������� ��������� ������� ������ ����� ������. 

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int r1;
		int r2;

		double sR1;
		double sR2;

		System.out.println("������� ������ ������� �����:");
		r1 = sc.nextInt();

		System.out.println("������� ������ ������� �����:");
		r2 = sc.nextInt();

		sR1 = 3.14 * Math.pow(r1, 2);
		sR2 = 3.14 * Math.pow(r2, 2);

		if (sR2 < sR1) {
			System.out.println("������� ������� �����" + sR1 + " ������ ������� " + sR2);
		} else {
			System.out.println("������� ������� ����� " + sR2 + " ������ ������� " + sR1);
		}

	}

}

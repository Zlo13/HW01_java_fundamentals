package ru.htp.branching.main;

import java.util.Scanner;

public class Main10 {

//  11. ��������� ���������, ������� ��������� ������� ������ ������������ ������.

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int b, h, b1, h1;
		int result, result1;

		System.out.println("������� ��������� ������������");
		b = sc.nextInt();

		System.out.println("������� ������ ������������");
		h = sc.nextInt();

		result = (b * h) / 2;

		System.out.println("������� ��������� ������� ������������");
		b1 = sc.nextInt();

		System.out.println("������� ������ ������� ������������");
		h1 = sc.nextInt();

		result1 = (b1 * h1) / 2;

		if (result < result1) {
			System.out.println(
					"������� ������� ������������ " + result + " ������ ������� ������� ������������ " + result1);
		} else {
			System.out.println(
					"������� ������� ������������ " + result + " ������ ������� ������� ������������ " + result1);
		}

	}

}

package ru.htp.cycles.main;

import java.util.Scanner;

public class Main24 {
	
//  25. ��������� ���������� ��������� �����, ������� ���� ������������. 

	public static void main(String[] args) {
		
		int res = 1;
		int value;
		
		value = enterFromConsole("������� ����� ��������� �������� ����� ���������: ");
		
		for (int i =1; i <= value; i++) {
			res = res * i;
		}
		
		System.out.println("-------------------------");
		System.out.println("��������� ����� " + value + " = " + res);

	}
	
	public static int enterFromConsole(String message) {
		
		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}
		value = sc.nextInt();
		
		return value;
		
	}

}

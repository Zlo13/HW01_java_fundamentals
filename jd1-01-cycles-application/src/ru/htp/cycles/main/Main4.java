package ru.htp.cycles.main;

public class Main4 {

// 5. � ������� ��������� while �������� ��������� ����������� 
//    ����� ���� �������� ����� � ��������� �� 1 �� 99 ������������. (�� ������)

	public static void main(String[] args) {
		int a;
		int sum;

		sum = 0;
		a = 0;

		while (a < 100) {
			a++;

			if (0 != (a % 2)) {
				sum += a;
			}
		}
		
		System.out.println("����� ���� �� ������ ����� � ��������� �� 1 �� 99 = " + sum);

	}

}

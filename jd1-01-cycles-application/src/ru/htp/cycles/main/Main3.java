package ru.htp.cycles.main;

public class Main3 {

//  4. � ������� ��������� while �������� ��������� ������ 
//	   ���� ������ ����� � ��������� �� 2 �� 100 ������������. 

	public static void main(String[] args) {
		int a;
		int b;
		a = 1;

		while (a <= 100) {
			a++;
			b = a % 2;
			
			if (b == 0) {
				System.out.println(a);
			}
			
		}

	}

}

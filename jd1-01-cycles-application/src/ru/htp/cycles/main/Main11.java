package ru.htp.cycles.main;

public class Main11 {

//	12. ������������������ �n �������� ���: �1 = 1, an =6+ �n-1 , 
//	��� ������� n >1 ��������� ��������� ���������� ������������ 
//	������ 10 ������ ���� ������������������. 

	public static void main(String[] args) {

		int a = 1;
		long res = 1;

		for (int n = 2; n <= 10; n++) {

			a = 6 + a;
			res = res * a;

			System.out.print(n + "  ----  ");
			System.out.print(a + "  ----  ");
			System.out.println(res);

		}

		System.out.println("---------------------------------------------------------------------");
		System.out.println("������������ ������ 10 ������ ���� ������������������ = " + res);

	}

}
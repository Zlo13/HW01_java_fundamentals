package ru.htp.cycles.main;

public class Main7 {

//  8. ��������� �������� ������� �� ������� [�,b] c ����� h: 
// y = (x + c) * 2 ���� � = 15
// y = (x - c) + 6 ���� � != 15

	public static void main(String[] args) {

		double a = -13, b = 16, h = 1, c = 5, x = 0, y;

		while (a <= b) {
			a = a + h;
			x = a - 1;

			if (x != 15) {
				y = (x - c) + 6;
				System.out.println("y = " + y);
			} else {
				y = (x + c) * 2;
				System.out.println("y = " + y);
			}
		}

	}

}

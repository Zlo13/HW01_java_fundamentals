package ru.htp.liner.main;

public class Main13 {

// 14. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R. 

	

	public static void main(String[] args) {

		int r = 15;
		double p;
		double s;

		p = 2 * Math.PI * r;
		System.out.println(p);

		s = Math.PI * Math.pow(r, 2);
		System.out.println(s);

	}

}

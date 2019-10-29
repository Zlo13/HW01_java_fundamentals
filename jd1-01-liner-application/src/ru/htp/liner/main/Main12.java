package ru.htp.liner.main;

public class Main12 {

// 13. Заданы координаты трех вершин треугольника  (х1 у2),(х2, у2) ),(х3, у3). 
//	Найти его периметр и площадь. 

	public static void main(String[] args) {

		int x1 = 5, x2 = 3, x3 = 2, y1 = 7, y2 = 8, y3 = 12;
		double a, b, c, p, s;

		a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
		c = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

		p = a + b + c;
		System.out.println("Периметр треугольника = " + p);

		s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		System.out.println("Площадь треугольника = " + s);

	}

}

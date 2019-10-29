package ru.htp.liner.main;

public class Main18 {

//  19. Дана сторона равностороннего треугольника. Найти площадь этого треугольника, 
//	его высоту, радиусы вписанной и описанной окружностей.

	public static void main(String[] args) {

		int a = 10;
		double s, h, rv, ro;

		h = (a * Math.sqrt(3)) / 2;
		System.out.println("Высота = " + h);

		s = Math.pow(a, 2) * Math.sqrt(3) / 4;
		System.out.println("Площадь = " + s);

		rv = a * Math.sqrt(3) / 6;
		System.out.println("Радиус вписанной окружности = " + rv);

		ro = a * Math.sqrt(3) / 3;
		System.out.println("Радиус описанной окружности = " + ro);

	}

}

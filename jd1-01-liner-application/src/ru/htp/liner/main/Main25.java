package ru.htp.liner.main;

public class Main25 {

// 26. Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у. 

	public static void main(String[] args) {

		double a, b, y, s; // тороплюсь

		a = 2;
		b = 4;
		y = 45;

		s = a * b * (Math.sin(y) / 2);

		System.out.println("Площадь треугольника = " + s);

	}

}

package ru.htp.liner.main;

import java.util.Random;

public class Main22 {

// 23. Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r). 

	public static void main(String[] args) {

		double r;
		double r1;
		double s;
		double s1;
		double sRing;

		r = randomValue(100);
		r1 = randomValue(1000);

		s = Math.PI * Math.pow(r, 2);
		s1 = Math.PI * Math.pow(r1, 2);

		sRing = s1 - s;

		System.out.println("Площадь кольца = " + sRing);

	}

	public static int randomValue(int limit) {
		Random rand = new Random();
		return rand.nextInt(limit);
	}

}

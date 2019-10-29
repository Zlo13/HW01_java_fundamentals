package ru.htp.liner.main;

public class Main23 {

//  24. Найти площадь равнобедренной трапеции с основаниями а и  b  и углом α при большем основании а. 

	public static void main(String[] args) {

		double s;
		double a = 9;
		double b = 6;
		double alpha = Math.PI / 4;

		s = (a + b) * (a - b) * Math.tan(alpha) / 4;

		System.out.println("Площадь трапеции = " + s);

	}

}

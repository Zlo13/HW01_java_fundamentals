package ru.htp.cycles.main;

public class Main10 {

//  11. Составить программу нахождения разности кубов первых двухсот чисел 

	public static void main(String[] args) {

		double diff = 1;

		for (int i = 1; i <= 200; i++) {

			 diff = diff - Math.pow(i, 3);
			
		}
		

		System.out.println(diff);

	}

}

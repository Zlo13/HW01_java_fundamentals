package ru.htp.liner.main;

import java.util.Random;

public class Main1 {

//2. Найдите  значение функции: с = 3 + а. 

	public static void main(String[] args) {
		
		Random rand = new Random();

		int c;
		int a;

		a = rand.nextInt();

		System.out.println("Случайное число типа int = " + a);

		c = 3 + a;

		System.out.println("Случайное число + 3 = " + c);

	}

}

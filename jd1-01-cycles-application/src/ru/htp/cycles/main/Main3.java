package ru.htp.cycles.main;

public class Main3 {

//  4. С помощью оператора while напишите программу вывода 
//	   всех четных чисел в диапазоне от 2 до 100 включительно. 

	public static void main(String[] args) {
		int a;
		int b;
		a = 1;

		while (a <= 100) {
			a++;
			b = a % 2;
			
			if (b == 0) {
				System.out.println(a);
			}
			
		}

	}

}

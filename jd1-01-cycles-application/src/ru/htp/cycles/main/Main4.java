package ru.htp.cycles.main;

public class Main4 {

// 5. С помощью оператора while напишите программу определения 
//    суммы всех нечетных чисел в диапазоне от 1 до 99 включительно. (не решино)

	public static void main(String[] args) {
		int a;
		int sum;

		sum = 0;
		a = 0;

		while (a < 100) {
			a++;

			if (0 != (a % 2)) {
				sum += a;
			}
		}
		
		System.out.println("Сумма всех не четных чисел в диапазоне от 1 до 99 = " + sum);

	}

}

package ru.htp.liner.main;

public class Main20 {

//  21. Дано действительное число R вида nnn.ddd (три цифровых разряда 
//	в дробной и целой частях). Поменять местами дробную и целую части 
//  числа и вывести полученное значение числа. 

	public static void main(String[] args) {

		double a = 226.745;
		double b, c, d, e, f;

		b = (int) a % 1000;
		c = b / 1000;

		d = a - b;
		e = d * 1000;

		f = c + (int) e;


		
		System.out.println(f);

	}

}

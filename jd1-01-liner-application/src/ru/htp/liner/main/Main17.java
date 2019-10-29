package ru.htp.liner.main;

import java.util.Scanner;

public class Main17 {
	
//  18. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба. 

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		int a;
		int sFace, sSurface, v;
		
		System.out.println("Введите длинну ребра куба");
		a = sc.nextInt();
		
		sFace = a*a;
		System.out.println("Площадь грани = " + sFace);
		
		sSurface = sFace*6;
		System.out.println("Площадь полной поверхности = " + sSurface);
		
		v = a*a*a;
		System.out.println("Объем куба = " + v);
	

	}

}

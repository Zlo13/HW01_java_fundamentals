package ru.htp.cycles.main;

public class Main25 {
	
//  26. Вывести на экран соответствий между символами и 
//	их численными обозначениями в памяти компьютера (Таблицу ASCII). 

	public static void main(String[] args) {
		
		
		for (int i = 1; i <= 255; i++) {
	
			System.out.print(i + "----");
			System.out.println((char)i);
		}

	}

}

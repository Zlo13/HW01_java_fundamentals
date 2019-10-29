package ru.htp.liner.main;

public class Main21 {

//  22. Дано натуральное число Т, которое представляет длительность 
//	прошедшего времени в секундах. Вывести данное значение длительности 
//	в часах, минутах и секундах в следующей форме: ННч ММмин SSc

	public static void main(String[] args) {
		
		int a = 18943;
		int h, m, s;

		h = (int) a / 3600;

		m = (a - 3600 * h) / 60;

		s = a - ((3600 * h) + (60 * m));

		System.out.println(h + ":" + m + ":" + s);

	}

}
